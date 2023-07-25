package bookstore;

public class Appbookstore {

	public static void main(String[] args) {
		Book b1 = new Book(2,"Let Us C",150);
		Book b2 = new Book(3,"Atomic Habits",150);
		
		/*
		 * for(int i = 0; i < 5;i++) { Book b = new Book() }
		 */
		
		System.out.println(Book.getBookCount());
		String []title = BookStore.getBookTitles();
		for(String t : title) {
			System.out.println(t);
		}
		
		float price[] = BookStore.getBookPrice();
		int size = price.length;
		float sum = (float)0.0;
		for(float p : price) {
			System.out.println(p);
			sum = sum + p;
		}
		float avg = sum/size;
		System.out.println("Average of books = "+avg);
		
		
		
	}

}
