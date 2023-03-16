package codeIT;

public class bookMain {
    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book();
        Book b3 = new Book();
        Book b4 = new Book();
        Book b5 = new Book();

        b1.createBook("001", "The great Gatsby", "F. Scott Fitzgerald", 500, true);
        b2.createBook("002", "Harry Potter", "J.K Rowelling", 1500, true);
        b3.createBook("003", "The Snowman", "Jo Nesbo", 300, true);
        b4.createBook("004", "Pride and Prejudice", "Jane Austen", 200, true);
        b5.createBook("005", "The Folklore of Air", "Holly Black", 2300, true);

        b1.displayBook();
        b2.displayBook();
        b3.displayBook();
        b4.displayBook();
        b5.displayBook();

        b1.displayBookByName("The Great Gastby");

        b1.BorrowBook();

    }
}
