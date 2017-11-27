public class BeerSong {
	public static void main (String[] args) {
		int beerNum = 99;
		String word = "bootles";
		
		while (beerNum > 0) {
			if (beerNum == 1) {
				word = "bootle";		//no singular, como em UMA garrafa
			}
			
			System.out.println(beerNum + " " + word + " of beer on the wall");
			System.out.println(beerNum + " " + word + " of beer.");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			beerNum = beerNum - 1;
		}
		System.out.println("No more bootles of beer on the wall");
	}
}