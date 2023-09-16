import java.util.Random;
import java.util.Scanner;

class RPSGame {
    private String[] choices = {"rock", "paper", "scissors"};
    private Random random = new Random();

    public String getRandomChoice() {
        int randomIndex = random.nextInt(choices.length);
        return choices[randomIndex];
    }

    public String determineWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equals(computerChoice)) {
            return "It's a tie!";
        } else if (
            (playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
            (playerChoice.equals("scissors") && computerChoice.equals("paper")) ||
            (playerChoice.equals("paper") && computerChoice.equals("rock"))
        ) {
            return "You win!";
        } else {
            return "Computer wins!";
        }
    }
}

public class rockpapergame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RPSGame game = new RPSGame();

        System.out.println("Welcome to Rock, Paper, Scissors!");
        boolean playAgain = true;

        while (playAgain) {
            System.out.println("Enter your choice: rock, paper, or scissors");
            String playerChoice = scanner.nextLine().toLowerCase();

            String computerChoice = game.getRandomChoice();

            System.out.println("Computer chose: " + computerChoice);
            System.out.println("You chose: " + playerChoice);

            String result = game.determineWinner(playerChoice, computerChoice);
            System.out.println(result);

            System.out.println("Do you want to play again? (yes/no)");
            String playAgainResponse = scanner.nextLine().toLowerCase();

            if (!playAgainResponse.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Thanks for playing!");
        scanner.close();
    }
}

