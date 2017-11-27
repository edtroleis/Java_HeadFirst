public class MovieTestDrive {
	public static void main(String[] args) {
		Movie one = new Movie();
		one.setTitle("Gone with the Stock");
		one.setGenre("Tragic");
		one.setRating(-2);
		
		Movie two = new Movie();
		two.setTitle("Lost in Cubicle Space");
		two.setGenre("Comedy");
		two.setRating(5);
		
		Movie three = new Movie();
		three.setTitle("Byte Club");
		three.setGenre("Tragic but ultimately uplifting");
		three.setRating(127);
	}

}