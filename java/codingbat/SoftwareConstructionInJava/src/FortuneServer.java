import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class FortuneServer {
    
    public static void main(String[] args) throws Exception {
        //servePart1();
        //servePart2();
        servePart3();
    }
    
    private static final String[] FORTUNES = {
        "Use the force", "Believe in yourself"
    };
    
    private static void servePart1() throws IOException {
        ServerSocket sock = new ServerSocket(4444);
        System.out.println("Fortune server listening...");
        while (true) {
            Socket client = sock.accept();
            String fortune = FORTUNES[(int)Math.floor(Math.random() * FORTUNES.length)];
            System.out.println("Telling " + client + ": " + fortune);
            PrintWriter out = new PrintWriter(new OutputStreamWriter(client.getOutputStream()), true);
            out.println(fortune);
            out.flush();
            out.close();
        }
    }
    
    private static final Map<String,String> HOROSCOPES = new HashMap<String,String>();
    static {
        HOROSCOPES.put("Aries", "You will write some code today");
        HOROSCOPES.put("Taurus", "You will go to 6.005 recitation today");
        HOROSCOPES.put("Gemini", "You will use your computer today");
        HOROSCOPES.put("Cancer", "You will read the word \"kumquat\" today");
        HOROSCOPES.put("Leo", "You will write a bunch of code today");
        HOROSCOPES.put("Virgo", "You will write more than 3 lines of code today");
        HOROSCOPES.put("Libra", "You will write code in Java today");
        HOROSCOPES.put("Scorpio", "You will laugh at your 6.005 TA's jokes today");
        HOROSCOPES.put("Sagittarius", "You will not resolve P=?NP today");
        HOROSCOPES.put("Capricorn", "You will compute the prime factors of 3 today");
        HOROSCOPES.put("Aquarius", "You will receive email today");
        HOROSCOPES.put("Pisces", "You will not violate the laws of physics today");
    };
    
    private static void servePart2() throws IOException {
        ServerSocket sock = new ServerSocket(4444);
        System.out.println("Horoscope server listening...");
        while (true) {
            final Socket client = sock.accept();
            System.out.println("Spinning a thread for " + client);
            new Thread(new Runnable() {
                public void run() {
                    try {
                        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
                        String sign = in.readLine();
                        String horoscope = HOROSCOPES.get(sign);
                        System.out.println("  Telling " + sign + ": " + horoscope);
                        PrintWriter out = new PrintWriter(new OutputStreamWriter(client.getOutputStream()), true);
                        out.println(horoscope);
                        out.flush();
                        client.close();
                    } catch (IOException ioe) {
                        ioe.printStackTrace();
                    }
                }
            }, "Serving " + client).start();
        }
    }
    
    private static void servePart3() throws IOException {
        ServerSocket sock = new ServerSocket(4444);
        System.out.println("Proclamation server listening...");
        while (true) {
            final Socket client = sock.accept();
            System.out.println("Spinning a thread for " + client);
            new Thread(new Runnable() {
                public void run() {
                    try {
                        Reader in = new InputStreamReader(client.getInputStream());
                        Writer out = new OutputStreamWriter(client.getOutputStream());
                        while (true) {
                            int input = in.read();
                            if (input < 0) { break; }
                            int upper = Character.toUpperCase(input);
                            out.write(upper);
                            out.flush();
                        }
                        System.out.println("  Done with " + client);
                        client.close();
                    } catch (IOException ioe) {
                        ioe.printStackTrace();
                    }
                }
            }, "Serving " + client).start();
        }
    }
}