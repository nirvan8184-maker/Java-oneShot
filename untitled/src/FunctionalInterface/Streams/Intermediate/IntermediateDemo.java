package FunctionalInterface.Streams.Intermediate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class IntermediateDemo {


    //------------------------------------------------------------------------------------------------

    // we'll make the predicate for the filter stream here itself, but we can also make it as a separate class and then use it in the filter stream
    //        static Predicate<Book> isCheaperThan10 = book -> book.price < 10;

    //------------------------------------------------------------------------------------------------
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
        books.add(new Book("Harry Potter and the Sorcerer\'s Stone", 1997, 10.49, "Fantasy"));
        books.add(new Book("The Lord of the Rings", 1954, 15.99, "Fantasy"));



        // Our target is to complete all these

        // 1. Filtering: books Cheaper than $10
        System.out.println("Books cheaper than $10:");

//        Stream<Book> stream1 = books.stream();
//        Stream<Book> stream2 = stream1.filter(book -> book.price < 10);
//        stream2.forEach(System.out::println);
        //   Stream<Book> stream2 = stream1.filter(isCheaperThan10); // using the predicate we defined above

        // in one line we can also do it like this
         books.stream().filter(book -> book.price < 10).forEach(System.out::println);

         //-----------------------------------------------------------------------------------------------------

        // 2. Mapping: Get book titles to uppercase
        System.out.println("\nBooks with uppercase titles:");

        Stream<Book> uppercaseTitles = books.stream().map(book -> {
            book.title = book.title.toUpperCase();
            return book;
        });
        uppercaseTitles.forEach(System.out::println);


        //------------------------------------------------------------------------------------------------------


        // 3. Sorting: Books sorted by publication year
        System.out.println("\nBooks sorted by publication year:");


        Stream<Book> sortedBooks = books.stream().sorted((b1, b2) -> Integer.compare(b1.publicationYear, b2.publicationYear));
        sortedBooks.forEach(System.out::println);


        //-------------------------------------------------------------------------------------------------------

        // 4. Distinct: Remove Duplicate Titles
        System.out.println("\nUnique Books:");


        Stream<Book> uniqueBooks = books.stream().distinct();
        uniqueBooks.forEach(System.out::println);


        //-------------------------------------------------------------------------------------------------------

        // 5. Limit: Display only first 3 books
        System.out.println("\nFirst 3 Books:");

        Stream<Book> firstThreeBooks = books.stream().limit(3);
        firstThreeBooks.forEach(System.out::println);

        // 5.5 if we have to print the first three of the sorted books
        System.out.println("\nFirst 3 Books sorted by publication year:");

        Stream<Book> firstThreeSortedBooks = books.stream()
                .sorted((b1, b2) -> Integer.compare(b1.publicationYear, b2.publicationYear))  // sorting the books by publication year
                .limit(3); // limiting the stream to the first 3 books after sorting
        firstThreeSortedBooks.forEach(System.out::println);

        // 6. Skip: Skip the first 2 books and display the rest
        System.out.println("\nBooks after skipping the first 2:");


        Stream<Book> afterSkippingTwoBooks = books.stream().skip(2);
        afterSkippingTwoBooks.forEach(System.out::println);

    }
}
