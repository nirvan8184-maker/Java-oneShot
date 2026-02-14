package FunctionalInterface.Streams.Intermediate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BookStoreChallenge {

    /*
       - Discounted Books: Identify all Books that are priced over $10. display these books.
       - classics Collection: Identify and display books that were published before 1950.
       - Upcoming title: Generate a list of future book title for the next year  by adding the suffix "(coming soon)" to all the current titles
       - Sort by Price: the bookstore wants to print price price tags for all the books Display the books sorted by price in ascending order.
       - Rare books: A rare book is one where the title has more than 20 characters. Identify and display all rare books in the collection.

        */


    public static void main(String[] args) {
        // Create a list of at least 10 books
        List<Book> books = new ArrayList<>(Arrays.asList(
                new Book("The Great Gatsby", 1925, 10.99, "Fiction"),
                new Book("To Kill a Mockingbird", 1960, 7.99, "Fiction"),
                new Book("1984", 1949, 8.99, "Dystopian"),
                new Book("Pride and Prejudice", 1813, 6.99, "Romance"),
                new Book("The Catcher in the Rye", 1951, 9.99, "Fiction"),
                new Book("Moby Dick", 1851, 11.99, "Adventure"),
                new Book("War and Peace", 1869, 12.99, "Historical"),
                new Book("The Hobbit", 1937, 8.49, "Fantasy"),
                new Book("Harry Potter and the Sorcerer's Stone", 1997, 10.49, "Fantasy"),
                new Book("The Lord of the Rings", 1954, 15.99, "Fantasy"),
                new Book("A Very Long and Unwieldy Book Title That Is Rare", 2001, 20.00, "Non-Fiction")
        ));

        // Discounted Books: priced over $10
        System.out.println("--- Discounted (price > $10) ---");
        books.stream()
                .filter(b -> b.price > 10)
                .forEach(System.out::println);

        // Classics: published before 1950
        System.out.println("\n--- Classics (published before 1950) ---");
        books.stream()
                .filter(b -> b.publicationYear < 1950)
                .forEach(System.out::println);

        // Upcoming titles: add suffix "(coming soon)" to titles
        System.out.println("\n--- Upcoming Titles (coming soon) ---");
        List<String> upcoming = books.stream()
                .map(b -> b.title + " (coming soon)")
                .toList();
        upcoming.forEach(System.out::println);

        // Sort by price ascending
        System.out.println("\n--- Books Sorted by Price (ascending) ---");
        books.stream()
                .sorted((b1, b2) -> Double.compare(b1.price, b2.price))
                .forEach(System.out::println);

        // Rare books: title length > 20 characters
        System.out.println("\n--- Rare Books (title length > 20) ---");
        books.stream()
                .filter(b -> b.title.length() > 20)
                .forEach(System.out::println);
    }
}
