
public class Iterate {
    public void print() {
        for(int i = 0; i < 20; i++) {
            if(i % 2 == 0)
                continue;
            System.out.println("i " + i);
        }
    }
}
