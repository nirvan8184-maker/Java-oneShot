package FunctionalInterface.Streams;

import FunctionalInterface.Streams.Intermediate.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOperationChallenge {
    static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("The Great Gatsby", 1925, 10.99, "Fiction"));
        books.add(new Book("To Kill a Mockingbird", 1960, 7.99, "Fiction"));
        books.add(new Book("1984", 1949, 8.99, "Dystopian"));
        books.add(new Book("Pride and Prejudice", 1813, 6.99, "Romance"));
        books.add(new Book("The Catcher in the Rye", 1951, 9.99, "Fiction"));
        books.add(new Book("Moby Dick", 1851, 11.99, "Adventure"));
        books.add(new Book("War and Peace", 1869, 12.99, "Historical"));
        books.add(new Book("The Hobbit", 1937, 8.49, "Fantasy"));
        books.add(new Book("Harry Potter and the Sorcerer's Stone", 1997, 10.49, "Fantasy"));
        books.add(new Book("The Lord of the Rings", 1954, 15.99, "Fantasy"));

        //-----------Challenge: Terminal Operations----------------
        // total cost of all books

        Double bookCost = books.stream()
                .mapToDouble(book -> book.price)
                .reduce(0, (total, price) -> total + price);

        System.out.println(bookCost);

        // Collecting books into list of titles

        List<String> bookTitle = books.stream()
                .map(book -> book.title)
                .collect(Collectors.toList());
        System.out.println(bookTitle);

        // grouping books by category
        books.stream()
                .collect(Collectors.groupingBy(book -> book.category))
                .forEach((category, bookList) -> {
                    System.out.println("Category: " + category);
                    bookList.forEach(System.out::println);
                });



    }
}
