package FunctionalInterface.Streams.Intermediate;

public class Book {
    public String title;
    int publicationYear;
    public double price;
    public String category;

    public Book(String title, int publicationYear, double price, String category) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.price = price;
        this.category = category;
    }


    // toString method to print the book details
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", publicationYear=" + publicationYear +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
