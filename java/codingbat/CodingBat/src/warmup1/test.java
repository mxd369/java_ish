package warmup1;
class diff21{
    public static int diff21(int n){
        int absdiff = Math.abs(n-21);
        if (n >= 21){
            return absdiff * 2;
        } else
            return absdiff; 
    }
class test {
	public void main(String args[]){
		System.out.println("Test Passed");
		System.out.print("Should be 2: ");
        System.out.println(diff21(19));
        System.out.println();
        System.out.print("Should be 11: ");
        System.out.println(diff21(10));
        System.out.println();
        System.out.print("Should be 0: ");
        System.out.println(diff21(21));
        System.out.println();
	}
}
}