package bookstore;

public class Book {
	private int BookId;
	private String BookTitle;
	private float BookPrice;
	private static int BookCount;
	
	public Book() {
		BookId = 1;
		BookTitle = "Lateral Thinking";
		BookPrice = (float)99.99;
		BookCount++;
	}

	public Book(int bookId, String bookTitle, float bookPrice) {
//		super();
		BookId = bookId;
		BookTitle = bookTitle;
		BookPrice = bookPrice;
		BookCount++;
	}

	public int getBookId() {
		return BookId;
	}

	public void setBookId(int bookId) {
		BookId = bookId;
	}

	public String getBookTitle() {
		return BookTitle;
	}

	public void setBookTitle(String bookTitle) {
		BookTitle = bookTitle;
	}

	public float getBookPrice() {
		return BookPrice;
	}

	public void setBookPrice(float bookPrice) {
		BookPrice = bookPrice;
	}

	public static int getBookCount() {
		return BookCount;
	}

	public static void setBookCount(int bookCount) {
		BookCount = bookCount;
	}
	
	
	
	
	
	
	

}
