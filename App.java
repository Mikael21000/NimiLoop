import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner in = new Scanner(System.in);
        String answer = "Emma";
        String guess = "";
        int guessCounter = 0;

        do {
            System.out.println("Guess my name (type stop to exit)");
            guess = in.nextLine();
            if (!guess.equals("stop")) { 
                guessCounter++; 
            }
        } while (!answer.equals(guess) && !guess.equals("stop"));

        if (answer.equals(guess)) {
            System.out.println("Congratulations!");
        }

        System.out.println("You guessed " + guessCounter + " times.");

    }
    

