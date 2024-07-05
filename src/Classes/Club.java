package Classes;

public class Club {
    String name;
    String country;
    int ratingPoints;
    Player []players;

    public Club(){
    }

    public Club(String name, String country, int ratingPoints, Player []players) {
        this.name = name;
        this.country = country;
        this.ratingPoints = ratingPoints;
        this.players = players;
    }

    public void printClubData() {
        System.out.println("Name: " + this.name + ". Country: " + this.country + ". RatingPoints: " + this.ratingPoints + ". Players:");
        for (int i = 0; i < this.players.length; i++) {
            System.out.println(this.players[i]);
        }
    }
}
