package rockpaperscissors;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsLizardSpock {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean letsContinue = true;

        while (letsContinue) {

            //Get the input from user

            boolean isValid = true;
            String response = "";
            do {
                System.out.print("Enter your choice (rock, paper, scissors, lizard, spock): ");
                response = scanner.nextLine().toLowerCase().trim();
                System.out.println("You chose: " + response);

                if(!isValid(response)) {
                    System.out.println("Please enter correct choice (rock, paper, scissors, lizard, spock): ");
                }
            } while (!isValid(response));

            //Random choice from computer
            String[] choices = {"rock", "paper", "scissors", "lizard", "spock"};
            Random random = new Random();
            int randomIndex = random.nextInt(choices.length);
            String choiceOfComputer = choices[randomIndex];
            System.out.println("Computer chose: " + choiceOfComputer);
            rockPaperScissors(response, choiceOfComputer);

            char res;

            do {
                System.out.println("Do You want to continue? (y/n): ");
                res = scanner.nextLine().toLowerCase().charAt(0);

                if (res != 'y' && res != 'n') {
                    System.out.println("Invalid input. Please enter 'y' or 'n'.");
                }
            } while (res != 'y' && res != 'n');

            letsContinue = (res == 'y');
        }
    }

    private static void rockPaperScissors(String response, String choiceOfComputer) {

        if (Objects.equals(response, choiceOfComputer)) {
            System.out.println("TIE");
        } else if (
                (response.equals("rock") && (choiceOfComputer.equals("scissors") || choiceOfComputer.equals("lizard"))) ||
                        (response.equals("paper") && (choiceOfComputer.equals("rock") || choiceOfComputer.equals("spock"))) ||
                        (response.equals("scissors") && (choiceOfComputer.equals("paper") || choiceOfComputer.equals("lizard"))) ||
                        (response.equals("lizard") && (choiceOfComputer.equals("spock") || choiceOfComputer.equals("paper"))) ||
                        (response.equals("spock") && (choiceOfComputer.equals("rock") || choiceOfComputer.equals("scissors")))
        ) {
            System.out.println("You win! Congrats 🎉");
        } else {
            System.out.println("Computer wins! 🤖");
        }
    }

    private static boolean isValid(String userChoice) {
        String[] choices = {"rock", "paper", "scissors", "lizard", "spock"};
        for (String choice : choices) {
            if (userChoice.equals(choice)) {
                return true;
            }
        }
        return false;
    }
}
