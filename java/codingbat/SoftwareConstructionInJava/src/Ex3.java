
public class Ex3 {
    public static void main(String[] args) {

        try{
            foo(10);
            foo(-5);
        }catch(Exception e){
            System.err.println("An error occured!");
            System.err.println(e.getMessage());
        }
    }
    public static int foo(int x){
        System.out.println("Begin foo");
        try{
            int y = moo(x);
            return y + 1;
        }finally{
            System.out.println("End foo");
        }
    }
    
    public static int moo(int x){
        System.out.println("Begin moo");
        int z = boo(x);
        System.out.println("End moo");
        return z - 1;
    }
    
    public static int boo(int x){
        if(x > 0){
            return x;
        }else{
            throw new RuntimeException("No negative arguments to boo!");
        }
    }
}