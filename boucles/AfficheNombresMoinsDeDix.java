package boucles;

public class AfficheNombresMoinsDeDix {
	public static void main(String[] args) {
		System.out.println("Combien de nombres vous allez saisir?...: ");
		int numEntrees = Fonctions.readNumber();
		if (numEntrees < 0) {
			numEntrees = Fonctions.tranformEnPositif(numEntrees);
		}
		if (numEntrees == 0) {
			System.out.println("A bientôt...");
			System.exit(0);
		}
		
		
		int[] tab = new int[numEntrees];
		int counter = 0;
		
		while (counter < numEntrees) {
			tab[counter] = Fonctions.readNumber();
			counter++;
		}
		
		for  (int num : tab) {
			if (num < 10) {
				System.out.println(num);
			}
		}
		
	}

}
