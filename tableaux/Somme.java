package tableaux;

public class Somme {
	public static void main(String[] args) {
		
		
		int[][] tableauDeuxDimensions1 = Fonctions.creerTableauDeDeuxDimension();
		int[][] tableauDeuxDimensions2 = Fonctions.creerTableauDeDeuxDimension();
		System.out.println("****** Contenu du premier tableau *************");
		Fonctions.afficheTableauDeuxDimensions(tableauDeuxDimensions1);
		System.out.println("****** Contenu du deuxieme tableau *************");
		Fonctions.afficheTableauDeuxDimensions(tableauDeuxDimensions2);
		int[][] sommeDesDeuxtableauDeuxDimensions = somme(tableauDeuxDimensions1, tableauDeuxDimensions2);
		System.out.println("************** La somme des deux****************");
		Fonctions.afficheTableauDeuxDimensions(sommeDesDeuxtableauDeuxDimensions);
	}
	
	/**
	 * Calcule et retourne la somme de chaque cage des deux tableaux.
	 * Les tableaux doivent avoir la même dimensions
	 * 
	 * @param premierTableau   Un tableau de integers
	 * @param deuxiemeTableau  Un tableau de integers
	 * @throws ArrayIndexOutOfBoundsException
	 * @return      un tableau avec la somme des deux tableaux
	 * 
	 */
	public static int[][] somme(int[][] premierTableau, int[][] deuxiemeTableau) {
		
		int[][] somme = new int[premierTableau.length][premierTableau[0].length];
		for (int i = 0; i < premierTableau.length; i++) {
			for (int j = 0; j < premierTableau[i].length; j++) {
				somme[i][j] = premierTableau[i][j] + deuxiemeTableau[i][j];
			}
		}
		return somme;
	}
	

}
