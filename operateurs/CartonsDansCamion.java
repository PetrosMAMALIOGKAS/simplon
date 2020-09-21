package operateurs;

public class CartonsDansCamion {
	public static void main(String[] args) {
		System.out.println("Quelle est la capacité du camion?...");
		float capaciteCamion = Fonctions.readFlottant();
		if (capaciteCamion < 0) {
			capaciteCamion = Fonctions.tranformEnPositif(capaciteCamion);
		}
		System.out.println("Quel est le poids des cartons?...");
		float poidsCarton = Fonctions.readFlottant();
		float result = capaciteCamion / poidsCarton;
		System.out.println("Seulement " + (int) result + " cartons peuvent être mis dans le camion");
	}


}
