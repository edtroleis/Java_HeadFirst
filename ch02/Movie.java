public class Movie {
	private String title;
	private String genre;
	private int rating;

	public Movie() {}
	
	public void playIt() {
		System.out.println("Playing the movie");
	}
	
	public void setTitle(String pTitle) {
		title = pTitle;
	}
	
	public void setGenre(String pGenre) {
		genre = pGenre;
	}
	
	public void setRating(int pRating) {
		rating = pRating;
	}
}