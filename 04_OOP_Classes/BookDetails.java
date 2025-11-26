class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayBookInfo() {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : "+ price);

    }
}

public class BookDetails {
    public static void main(String[] args) {
        Book b1 = new Book("Wings Of Fire", "APJ Abdul Kalam", 499.99);
        Book b2 = new Book("Clean Code", "Robert C. Martin", 699.50);

        System.out.println(" Book 1 Details:");
        b1.displayBookInfo();

        System.out.println(" Book 2 Details:");
        b2.displayBookInfo();
    }
}

