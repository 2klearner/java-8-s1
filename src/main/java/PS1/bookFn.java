package PS1;

public class bookFn {
	
	   public static Book[] createBooks(int n) {
	        Book[] books = new Book[n];

	        for (int i = 0; i < n; i++) {
	            // Create a new Book object for each index in the array
	            books[i] = new Book();
	        }

	        return books;
	    }
	   
	   
	   public static void showBooks(Book[] books) {
	        System.out.printf("%-20s%-10s\n", "Book Title", "Price");
	        System.out.println("-----------------------------------");

	        for (Book book : books) {
	            // Display book title and price
	            System.out.printf("%-20sRs.%.2f\n", book.getBook_title(), book.getBook_price());
	        }
	    }

}
