package numberGuesser;
import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int num;
		int answer;
		int allowedGuesses;
		int usedGuesses = 0;
		int range;
		
		System.out.println("Welcome to Number Guesser");
		System.out.println();
		System.out.println("What would you like the range of numbers to be?");
		System.out.println("Enter Here:");
		range = scanner.nextInt();
		System.out.println();
		System.out.println("How many guesses would you like?"); // 0 = infinite
		System.out.println("Enter Here:");
		allowedGuesses = scanner.nextInt();
		
		
		num = random.nextInt(1, range + 1);  // generating random number
		
		do {
			System.out.println();
			usedGuesses += 1;
			allowedGuesses -= 1;
			System.out.println("Enter A Number: (" + (allowedGuesses + 1) + " guesses left)");
			answer = scanner.nextInt();
			
			if(answer != num && allowedGuesses == 0) {
				System.out.println("Sorry you have ran out of guesses!");
				System.out.println("Answer: " + num);
				break;
			}
			else if(answer < num) {
				System.out.println("Higher!");
			}
			else if(answer > num) {
				System.out.println("Lower!");
			}
			else if(answer == num) {
				System.out.println();
				System.out.println("That is correct!");
				System.out.println("Answer: " + num);
				System.out.println("Guesses: " + usedGuesses);
			}
			else {
				System.out.println("Error...");
				System.out.println("Please check the code");
				break;
			}
		}
		while(answer != num);
		
		scanner.close();
				
	}

}
