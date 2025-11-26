// tut-8 (1)
class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
    }
}

class Technical extends Book {
    String subject;

    Technical(String title, String author, String subject) {
        super(title, author);
        this.subject = subject;
    }

    void display() {
        System.out.println("Technical Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Subject: " + subject);
    }
}

class Story extends Technical {
    String genre;

    Story(String title, String author, String subject, String genre) {
        super(title, author, subject);
        this.genre = genre;
    }

    void display() {
        System.out.println("Story Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Subject: " + subject);
        System.out.println("Genre: " + genre);
    }
}

public class Bookoverride {
    public static void main(String[] args) {
        Book ref = new Book("Generic Book", "John Doe");
        ref.display();
        ref = new Technical("Java Programming", "Herbert Schildt", "Programming");
        ref.display();
        System.out.println();
        ref = new Story("Harry Potter", "J.K. Rowling", "Fiction Writing", "Fantasy");
        ref.display();
    }
}
