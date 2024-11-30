import java.util.Scanner;

class Player {
    private int jno;
    private String name;
    private int run;
    private int match;

    // Setter and Getter methods for each member
    public void setJno(int no) {
        this.jno = no;
    }

    public int getJno() {
        return jno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getRun() {
        return run;
    }

    public void setMatch(int match) {
        this.match = match;
    }

    public int getMatch() {
        return match;
    }

    // Method to display player information
    public void displayPlayer() {
        System.out.println("Jersey No: " + jno + ", Name: " + name + ", Runs: " + run + ", Matches: " + match);
    }
}

public class PlayerDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player[] p1 = new Player[3];

        // Input data for 5 players
        for (int i = 0; i < p1.length; i++) {
            p1[i] = new Player();
            System.out.print("Enter the jersey number of player: ");
            int jno = sc.nextInt();
            sc.nextLine(); // Consume newline

            System.out.print("Enter the name: ");
            String name = sc.nextLine();

            System.out.print("Enter the runs: ");
            int run = sc.nextInt();

            System.out.print("Enter the number of matches of this player: ");
            int match = sc.nextInt();

            p1[i].setJno(jno);
            p1[i].setName(name);
            p1[i].setRun(run);
            p1[i].setMatch(match);
        }

        // Display all player information
        System.out.println("\nAll Player Details:");
        for (int i = 0; i < p1.length; i++) {
            if (p1[i] != null) {
                p1[i].displayPlayer();
            }
        }

        // Delete a player record by specific index
        System.out.println("\nEnter the index of the player to delete: ");
        int deleteIndex = sc.nextInt();

        if (deleteIndex >= 0 && deleteIndex < p1.length) {
            p1[deleteIndex] = null;  // Marking the player as null (deleted)
            System.out.println("Player at index " + deleteIndex + " deleted.");
        } else {
            System.out.println("Invalid index.");
        }

        // Display remaining player information
        System.out.println("\nRemaining Player Details:");
        for (int i = 0; i < p1.length; i++) {
            if (p1[i] != null) {
                p1[i].displayPlayer();
            }
        }

        // Sort p1 by matches in ascending order
        for (int i = 0; i < p1.length - 1; i++) {
            for (int j = i + 1; j < p1.length; j++) {
                if (p1[i] != null && p1[j] != null && p1[i].getMatch() > p1[j].getMatch()) {
                    Player temp = p1[i];
                    p1[i] = p1[j];
                    p1[j] = temp;
                }
            }
        }

        // Display sorted player information by matches
        System.out.println("\nPlayers' Information after Sorting by Matches:");
        for (int i = 0; i < p1.length; i++) {
            if (p1[i] != null) {
                p1[i].displayPlayer();
            }
        }

        sc.close();
    }
}
