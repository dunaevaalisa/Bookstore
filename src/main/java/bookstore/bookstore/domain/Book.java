package bookstore.bookstore.domain;

public class Book {
    private String title;
    private String author;
    private int year;
    private String isbn;
    private double price;

    public Book(String title, String autor, int year, String isbn, double price) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle() {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor() {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear() {
        this.year = year;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn() {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice() {
        this.price = price;
    }

}
