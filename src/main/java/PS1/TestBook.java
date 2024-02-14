package PS1;

public class TestBook {

	public static void main(String[] args) {
        int n = 2; // Number of books to create

        // Create n objects of Book in an array
        Book[] books = bookFn.createBooks(n);

        // Set book details using setter methods
        books[0].setBook_title("Java Programming");
        books[0].setBook_price(350.50);

        books[1].setBook_title("Let Us C");
        books[1].setBook_price(200.00);

        // Display books along with their description
        bookFn.showBooks(books);
    }
}
