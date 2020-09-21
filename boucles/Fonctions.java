package boucles;

import java.util.Scanner;

public class Fonctions {
	public static int readNumber() {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		boolean flag = true;
		while (flag) {
			try {
				flag = false;
				System.out.println();
				System.out.println("Give me a number..:");
				String nombre1 = scanner.nextLine();
				i = Integer.parseInt(nombre1);
			} 
			catch(Exception e){
				System.out.println("It must be a number");
				flag = true;
			}
		}
		return i;
	}
	
	public static float readFlottant() {
		Scanner scanner = new Scanner(System.in);
		float i = 0;
		boolean flag = true;
		while (flag) {
			try {
				flag = false;
				System.out.println();
				System.out.println("Give me a number..:");
				String nombre1 = scanner.nextLine();
				i = Float.parseFloat(nombre1);
			} 
			catch(Exception e){
				System.out.println("It must be a float");
				flag = true;
			}
		}
		return i;
	}
	
	public static String readOperateur() {
		String operateur = "";
		Scanner scanner = new Scanner(System.in);
		boolean flag = true;
		while (flag) {
			flag = false;
			System.out.println();
			System.out.println("Donner un operateur (+, -, /, %)..:");
			operateur = scanner.nextLine();
			if (!operateur.equals("+") && !operateur.equals("-") && !operateur.equals("/") && !operateur.equals("%")) {
				System.out.println("Operateur pas correct");
				flag = true;
			}
		}
		return operateur;
	}
	
	public static int creeRandomInteger(int min, int max) {   
	     int    random_int    = (int) (Math.random() * (max - min + 1) + min);
	     return random_int;
	}
	
	public static char minisculeToMajuscule(char character) {
		int asciiCode = character - 32;
		return (char) asciiCode;
	}
	
	public static int tranformEnPositif(int num) {
		System.out.println("le nombre doit-être possitif donc je prends la valeur absolut");
		return Math.abs(num);
	}
	
	public static float tranformEnPositif(float num) {
		System.out.println("le nombre doit-être possitif donc je prends la valeur absolut");
		return Math.abs(num);
	}

}
