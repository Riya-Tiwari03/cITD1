package codeIT;

public class Book {
    String bookID, bookName, authorName, libName;
    boolean avaliability;
    int bookPrice;

    void createBook(String bId, String bName, String aName, int bPrice, boolean avail){
        this.authorName = aName;
        this.bookID = bId;
        this.bookPrice = bPrice;
        this.bookName = bName;
        this.avaliability = avail;
    }

    void displayBook(){
        System.out.println("Book Name: "+ bookName);
        System.out.println("Book id: "+ bookID);
        System.out.println("Author's Name: "+ authorName);
        System.out.println("Book Price: "+ bookPrice);
        System.out.println();
    }

    void displayBookByName(String b){
        System.out.println("Book Name: "+ bookName);
        System.out.println("Book id: "+ bookID);
        System.out.println("Author's Name: "+ authorName);
        System.out.println("Book Price: "+ bookPrice);
    }

    void BorrowBook(){
        if (avaliability == false){
            System.out.println("Not Available");
        }
        else{
            System.out.println("Available");
            avaliability = false;
        }
    }


}
