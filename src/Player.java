public class Player {
    String name;
    int runs;
    int balls;
    int wickets;
    int overs;

    // Constructor
    public Player(String name) {
        this.name = name;
        this.runs = 0;
        this.balls = 0;
        this.wickets = 0;
        this.overs = 0;
    }

    // Display Player Info
    public void displayStats() {
        System.out.println("Player: " + name);
        System.out.println("Runs: " + runs + " | Balls: " + balls);
        System.out.println("Wickets: " + wickets + " | Overs: " + overs);
    }
}
