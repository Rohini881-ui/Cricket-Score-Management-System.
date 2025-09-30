import java.util.ArrayList;

public class Team {
    String teamName;
    ArrayList<Player> players;
    int totalRuns;
    int totalWickets;

    // Constructor
    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
        this.totalRuns = 0;
        this.totalWickets = 0;
    }

    // Add player to the team
    public void addPlayer(Player p) {
        players.add(p);
    }

    // Display team details
    public void displayTeam() {
        System.out.println("Team: " + teamName);
        for (Player p : players) {
            p.displayStats();
        }
        System.out.println("Total Runs: " + totalRuns + " | Wickets: " + totalWickets);
    }
}
