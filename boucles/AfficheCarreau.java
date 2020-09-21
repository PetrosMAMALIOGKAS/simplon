package boucles;

public class AfficheCarreau {
	public static void main(String[] args) {
		System.out.println("Pour creer un carreau li me faut ses dimension donc ");
		int dimensions = Fonctions.readNumber();
		if (dimensions < 0) {
			Fonctions.tranformEnPositif(dimensions);
		}
		
		for (int ligne= 0; ligne < dimensions; ligne++) {
			for (int coulonne = 0; coulonne < dimensions; coulonne++) {
				System.out.print("X");
			}
			System.out.println();
		}

	}

}
