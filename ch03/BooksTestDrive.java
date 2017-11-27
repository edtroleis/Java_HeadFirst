public class BooksTestDrive {
	public static void main(String[] args) {
		int x = 0;
		Books[] myBooks = new Books[3];
		
		while (x < 3) {
			myBooks[x] = new Books();
			x++;
		}
		
		myBooks[0].title = "The Grapes of Java";
		myBooks[1].title = "The Java Gatsby";
		myBooks[2].title = "The Java Cookbook";
		myBooks[0].author = "bob";
		myBooks[1].author = "sue";
		myBooks[2].author = "ian";
		
		x = 0;
		while (x < 3) {
			System.out.print(myBooks[x].title);
			System.out.print(" by ");
			System.out.println(myBooks[x].author);
			x++;
		}
	}
}