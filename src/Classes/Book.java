package Classes;

public class Book{
    int id;
    String bookName;
    String authorName;

    public Book(){
    }

    public Book(int id, String bookName, String authorName) {
        this.id = id;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public String getData() {
        return "ID: " + this.id + ". Name: " + this.bookName + ". Author: " + this.authorName + ".";
    }
}
