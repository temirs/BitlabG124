package Classes;

public class BookHouse {
    Book[] books = new Book[1000];
    int size = 0;

    public void addBook(Book book) {
        books[size] = book;
        size ++;
    }

    public void printBooks() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i].getData());
        }
    }

    public void searchBook(String name) {
        boolean haveBook = false;
        for (int i = 0; i < size; i++) {
            if (books[i].bookName.equalsIgnoreCase(name)) {
                haveBook = true;
                System.out.println(books[i].getData());
            }
        }
        if (!haveBook) {
            System.out.println("Data Not Found");
        }
    }
}
