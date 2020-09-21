package conditions;

import java.util.Scanner;

public class PremierExercises {
	
	public static void main(String[] args) {
		// Character a = new Character('c');
		char a = 'a';
		int asciiCode = (int) a;
		System.out.println("le Ascii code  " + a + " est le " + asciiCode);
		asciiCode = asciiCode - 32;
		char b = (char) asciiCode;
		System.out.println("le Majuscule de  " + a + " est le " + b);
		
		int e = 6;
		int f = 5;
		int g = 6;
		float moy;
		int somme = e + f + g;
		moy = (float) somme / 3;
		System.out.println("le moyen est le " + moy);
		
		System.out.println("le somme de " + e + " plus " + f + " est le " + (e + f));
		System.out.println("le quotient de " + e + " divise par  " + f + " est le " + (e % f));
		
		
		
		String[] tab = {"a", "b", "c", "d", "e"};
		String temp = tab[0];
		tab[0] = tab[3];
		tab[3] = temp;
		temp = tab[1];
		tab[1] = tab[2];
		tab[2] = temp;
		temp = tab[2];
		tab[2] = tab[4];
		tab[4] = temp;
		temp = tab[3];
		tab[3] = tab[4];
		tab[4] = temp;
		System.out.println(tab[0] + tab[1] + tab[2] + tab[3] + tab[4]);
		
		
		
		
		
		int age = 27;
		if (age >= 18) {
			System.out.println("tu es majeur");
		}
		else {
			System.out.println("tu es mineur");
		}
		
		int nume = -16;
		System.out.print(Math.abs(nume));
		
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("Donner le premier nobre..:");
		String nombre1 = scanner.nextLine();
		System.out.println();
		System.out.println("Donner le deuxieme nobre..:");
		String nombre2 = scanner.nextLine();
		System.out.println();
		System.out.println("Donner le troisieme nobre..:");
		String nombre3 = scanner.nextLine();
		if (nombre1.equals(nombre2) || nombre1.equals(nombre3) || nombre3.equals(nombre2) ) {
			System.out.println("ily a des doublons");
		}
		else {
			System.out.println("il n y a pas des doublons");
		}
		
	}

}
