import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * File handling Tutorial by Navin Reddy
 */
public class FileDemo
{
    public static void main(String[] args) throws Exception
    {
        File f = new File("demo1.txt");
        FileOutputStream fos = new FileOutputStream(f);
        DataOutputStream dos = new DataOutputStream(fos);
        dos.writeUTF("Demo Content");
        
        FileInputStream fis = new FileInputStream(f);
        DataInputStream dis = new DataInputStream(fis);
        String str = dis.readUTF();
        System.out.println(str);
    }
}
