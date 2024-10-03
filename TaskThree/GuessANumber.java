import java.util.Random;
import java.util.Scanner;  

public class GuessANumber {
    private static int rnd_number;
	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
	System.out.println( "Can you guess what it is?...");
        makeAGuess();
    }


    private static void makeAGuess(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter your guess: ");
		
   
		if(scanner.hasNextDouble()){
			double guess = scanner.nextDouble();
		if (guess == rnd_number){
			 System.out.println("Congratulations! You guessed the number: " + rnd_number);
            } else if (guess <= 0) {
				System.out.println("Only numbers between 1 and 100");
				makeAGuess();
				} else if (guess >= 110) {
				System.out.println("Only numbers between 1 and 100");
				makeAGuess();
			} else if (guess < rnd_number) {
                System.out.println("Too low! Try again.");
                makeAGuess(); 
            } else {
                System.out.println("Too high! Try again.");
                makeAGuess();
			}
		}else {
			
       System.out.println("Invalid input. Please input numbers only");
	   scanner.next();
	   makeAGuess();
		}
	}
 }
