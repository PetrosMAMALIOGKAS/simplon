package boucles;

public class TableauDeMultiplication {
	
	public static void main(String[] args) {
		System.out.println("Pour creer la tableau de multiplication j'ai besoin un nombre de 1 à 10");
		int nombre = Fonctions.readNumber();
		if (nombre < 0) {
			System.out.println("le nombre doit-être possitif donc je prends la valeur absolut");
			nombre = Math.abs(nombre);
		}
		System.out.println("tableu de multiplication de " + nombre);
		for (int i=1; i <= 10; i++) {
			System.out.println(i + " x " + nombre + " = " + (nombre * i));
		}

	}

}
