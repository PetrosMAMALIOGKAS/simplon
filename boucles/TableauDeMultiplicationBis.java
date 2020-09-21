package boucles;


public class TableauDeMultiplicationBis {
	
	public static void main(String[] args) {
		System.out.println("Pour creer les tableaux de multiplication j'ai besoin deux nombres de 1 à 10");
		int nombre1 = Fonctions.readNumber();
		if (nombre1 < 0) {
			System.out.println("le nombre doit-être possitif donc je prends la valeur absolut");
			nombre1 = Math.abs(nombre1);
		}
		int nombre2 = Fonctions.readNumber();
		if (nombre2 < 0) {
			System.out.println("le nombre doit-être possitif donc je prends la valeur absolut");
			nombre2 = Math.abs(nombre2);
		}
		System.out.println("les tableaux de multiplication de " + nombre1 + " et " + nombre2);
		for (int i=1; i <= 10; i++) {
			String result1 = (nombre1 * i) > 9 ? Integer.toString(nombre1 * i) : Integer.toString(nombre1 * i) + " ";
			if (i > 9 ) {
				System.out.println(i + " x " + nombre1 + " = " + result1 + "   "  + "#  " +
						           i + " x " + nombre2 + " = " + result1 + "   ");
			}
			else {
				System.out.println(i + "  x " + nombre1 + " = " + result1 + "   " + "#  " +
						           i + "  x " + nombre2 + " = " + (i * nombre2));
			}
			
		}

	}

}
