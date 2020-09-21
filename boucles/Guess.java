package boucles;

import java.util.Scanner;



public class Guess {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("########################################");
		System.out.println("####    Welcome to the Guess game  #####");
		System.out.println("########################################");
		System.out.println();
		System.out.println("Difficulty level");
		System.out.println("1. easy    (7 tries)");
		System.out.println("2. medium  (5 tries)");
		System.out.println("3. hard    (3 tries)");
		boolean flag = true;
		int difficultyChoise = 0;
		while (flag) {
			flag = false;
			difficultyChoise = Fonctions.readNumber();
			if (difficultyChoise > 3 || difficultyChoise < 1) {
				System.out.println("Must be between 1 and 3");
				flag = true;
			}
		}
		int triesLeft = 0;
		switch (difficultyChoise) {
		case 1 : 
			triesLeft = 7;
			break;
		case 2 :
			triesLeft = 5;
			break;
		case 3 :
			triesLeft = 3;
			break;
		default :
			System.out.println("Errorrrr");
			break;
		}
		
		int randomInt = Fonctions.creeRandomInteger(65, 90);
		System.out.println("I'm thinking of a letter between A and Z.........");
		System.out.println("You have " + triesLeft + " tries to find the letter");
		int finalScore = 0;
		for (int tries = 1; tries <= triesLeft; tries++) {
			System.out.println("Its your try numero " + tries);
			System.out.println("Give me a letter between A and Z" );
			char letter = scanner.nextLine().charAt(0);
			if (letter > 96 && letter < 123) {
				letter = Fonctions.minisculeToMajuscule(letter);
			}
			if (letter > randomInt) {
				System.out.println("Sorry you to hi...");
			}
			else if (letter < randomInt) {
				System.out.println("Sorry you are to low...");
			}
			else {
				System.out.println("Bravo " + (char) randomInt + " is the letter!!!!");
				finalScore = triesLeft - tries; 
				break;
			}
		}
		int points = 0;
		switch (difficultyChoise) {
		case 1 :
			points = finalScore * 300;
			break;
		case 2 :
			points = finalScore * 500;
			break;
		case 3 :
			points = finalScore * 1000;
			break;
		default :
			System.out.println("error");
			break;
		}
		System.out.println("Your final score is " + points);
	}

}
