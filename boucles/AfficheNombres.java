package boucles;

public class AfficheNombres {
	public static void main(String[] args) {
		int nombre = Fonctions.readNumber();
		if (nombre < 0) {
			System.out.println("le nombre doit-être possitif donc je prends la valeur absolut");
			nombre = Math.abs(nombre);
		}
		for (; nombre > -1; nombre--) {
			if (nombre == 0) {
				System.out.print(nombre);
			}
			else {
				System.out.print(nombre + ",");
			}
		}

	}
	
}
