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
		Scanner scanner = new Scanner();
		
		System.out.print("Enter your guess: ");
		
        // use hasNextDouble to check if input is numeric, 
        // if so...
		if(scanner.hasNextDouble()){
			double guess = scanner.hasNextDouble();
        // Compare it with the random number
		if (guess == rnd_number){
			 System.out.println("Congratulations! You guessed the number: " + rnd_number);
            } else if (userGuess < rnd_number) {
                System.out.println("Too low! Try again.");
                makeAGuess(); 
            } else {
                System.out.println("Too high! Try again.");
                makeAGuess();
			}
		}else{
			
       System.out.println("Invalid input. Please input numbers between 1-100");
	   scanner.next();
	   makeAGuess();
		}
	}
    }
