package bookstore;

public class BookStore {
	private static Book bookData[] = new Book[3];
	static {
	Book b1 = new Book();
	Book b2 = new Book(2,"Let Us C",150);
	Book b3 = new Book(3,"Let Us c++",149);
	bookData[0] = b1;
	bookData[1] = b2;
	bookData[2] = b3;
	}

	public static String[] getBookTitles() {
		int size = bookData.length;
		String bookTitle[] = new String[size];
		int index = 0;
		for(Book title : bookData) {
			String t = title.getBookTitle();
			bookTitle[index] = t;
			index++;
		}
		
		return bookTitle;
		
	}
	
	public static float[] getBookPrice() {
		int size = bookData.length;
		float bookPrice[] = new float[size];
		int index = 0;
		for(Book price : bookData) {
			float f = price.getBookPrice();
			bookPrice[index] = f;
			index++;
		}
		
		return bookPrice;
	}
	
}
