package objets;

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

}
