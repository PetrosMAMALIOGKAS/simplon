package operateurs;

import java.util.Scanner;

public class Fonctions {
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
	
	public static float tranformEnPositif(float num) {
		System.out.println("le nombre doit-être possitif donc je prends la valeur absolut");
		return Math.abs(num);
	}

}
