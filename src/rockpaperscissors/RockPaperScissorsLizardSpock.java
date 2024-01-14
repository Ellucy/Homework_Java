package rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsLizardSpock {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Get the input from user
        System.out.print("Enter your choice (rock, paper, scissors, lizard, spock): ");
        String response = scanner.nextLine().toLowerCase().trim();
        System.out.println("You chose: " + response);

        //Random choice from computer
        String[] choices = {"rock", "paper", "scissors", "lizard", "spock"};
        Random random = new Random();
        int randomIndex = random.nextInt(choices.length);
        String choiceOfComputer = choices[randomIndex];
        System.out.println("Computer chose: " + choiceOfComputer);

        rockPaperScissors(response, choiceOfComputer);
    }

    private static void rockPaperScissors(String response, String choiceOfComputer) {
    }
}
