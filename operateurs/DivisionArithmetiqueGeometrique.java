package operateurs;

public class DivisionArithmetiqueGeometrique {
	
	public static void main(String[] args) {
		float nombre1 = Fonctions.readFlottant();
		float nombre2 = Fonctions.readFlottant();
		float moyenArithmentique = (nombre1 + nombre2) / 2;
		float moyenGeometrique = (float) Math.sqrt(nombre1 * nombre2);
		System.out.println("Moyen arithmetique de " + nombre1 + " et " + nombre2 + " est le " + moyenArithmentique);
		System.out.println("Moyen geometrique  de " + nombre1 + " et " + nombre2 + " est le " + moyenGeometrique);
	}
}
