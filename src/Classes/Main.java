package Classes;

public class Main {
    public static void main(String[] args) {
        Phone p1 = new Phone("OnePlus", "9RT", 280000);
        Phone p2 = new Phone();
        p2.name = "Iphone";
        p2.model = "15 Pro";
        p2.price = 350000;

        System.out.println(p1.getData());
        System.out.println(p2.getData());

        Player pl1 = new Player(11, "Drogba", "Didier", "attack");
        Player pl2 = new Player(8, "Frank", "Lampard", "midfielder");

        Player[] players = {pl1,pl2};

        Club c1 = new Club("Chelsea", "England", 3, players);
        c1.printClubData();

        BookHouse bookHouse = new BookHouse();
        Book book1 = new Book(98574, "Alice in Wonderland", "Logis K.Rroll");
        bookHouse.addBook(book1);
        bookHouse.printBooks();
    }
}
