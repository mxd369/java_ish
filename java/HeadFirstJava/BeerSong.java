public class BeerSong {
	public static void main(String[] args){
		int beerNum = 100;
		for(int i = 0;i<=100;i++){
			beerNum -= 1;
			if (beerNum != 1 && beerNum != 0){
				System.out.println(beerNum + " bottles of beer on the wall "+beerNum+" bottles of beer, you take one down pass it around "+beerNum+" bottles of beer on the wall.");
			}
			
			else if (beerNum == 1){
				System.out.println(beerNum + " bottle of beer on the wall "+beerNum+" bottle of beer, you take one down pass it around "+beerNum+" bottle of beer on the wall.");
			}
			else if (beerNum == 0) {
				System.out.println("This is the end of the beer song because there are "+beerNum+" beers left!");
				System.exit(0);
			}
		}
	}
}