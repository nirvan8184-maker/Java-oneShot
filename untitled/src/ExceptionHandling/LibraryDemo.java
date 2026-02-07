package ExceptionHandling;

class InvalidMembershipException extends Exception {
    public InvalidMembershipException(String message) {
        super(message);
    }
}

class BookUnavailableException extends Exception {
    public BookUnavailableException(String message) {
        super(message);
    }
}

class Library {
    int availableBooks = 3;

    public void borrowBooks(String memberName, int booksRequested) throws BookUnavailableException, InvalidMembershipException {
        if (booksRequested < 0) {
            throw new IllegalArgumentException("Number of books requested cannot be negative.");
        }
        if (booksRequested > availableBooks) {
            throw new BookUnavailableException("Not enough books available to borrow.");
        }
        if (memberName == null || memberName.isEmpty()) {
            throw new InvalidMembershipException("Invalid Membership.");
        }

    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Library library = new Library();

        try {
            library.borrowBooks(null,2); // This will throw InvalidMembershipException
            library.borrowBooks("Jhon",5); // This will throw BookUnavailableException
            library.borrowBooks("Alice",1); // Valid Request

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid request: " + e.getMessage());
        } catch (InvalidMembershipException e) {
            System.out.println("Membership error: " + e.getMessage());
        } catch (BookUnavailableException e) {
            System.out.println("Cannot borrow: " + e.getMessage());
        } finally {
            System.out.println("Thank you for using the library system.");
        }
    }
}
