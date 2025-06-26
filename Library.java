import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(String title) {
        books.add(new Book(title));
        System.out.println("Book added: " + title);
    }

    public void showBooks() {
        System.out.println("Available books:");
        for (Book book : books) {
            System.out.println(book.getTitle() + (book.isIssued() ? " [Issued]" : ""));
        }
    }

    public void issueBook(String title, User user) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isIssued()) {
                book.issue();
                System.out.println(user.getName() + " issued the book: " + title);
                return;
            }
        }
        System.out.println("Book not available or already issued.");
    }

    public void returnBook(String title, User user) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isIssued()) {
                book.returnBook();
                System.out.println(user.getName() + " returned the book: " + title);
                return;
            }
        }
        System.out.println("Book not found or not issued.");
    }
}