package ExceptionHandling;
class Library {
    int availableBooks = 3;


    public void borrowBooks(int booksRequested) {

        try {
            int[] books = {101, 102, 103};
            System.out.println("Books Requested: " + books[booksRequested]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You requested a book that does not exist");
        } catch(NullPointerException e) {
            System.out.println("Null pointer exception occurred");
        } finally {
            System.out.println("Thank you for using the library system.");
        }

    }
}
public class LibraryDemo {
    static void main(String[] args) {
        Library library = new Library();
        library.borrowBooks(2); // Valid request
        library.borrowBooks(5); // This will throw an error due to array index out of bounds
    }
  }

