package tableaux;

public class Echange {

	public static void main(String[] args) {
		
		int[][] tableauDeuxDimensions = Fonctions.creerTableauDeDeuxDimension();
		System.out.println("******Contenu du tableau avant la permuttation*******");
		Fonctions.afficheTableauDeuxDimensions(tableauDeuxDimensions);
		echange(tableauDeuxDimensions, 0,0 , 9,9);
		System.out.println("******Contenu du tableau apr�s la permuttation*******");
		Fonctions.afficheTableauDeuxDimensions(tableauDeuxDimensions);

	}
	/**
	 * Permutation l'�l�ment de l'indice i1,j1 avec l'�l�ment de l'indice i2,j2 
	 * 
	 * @param tab  un tableu des deux dimensions
	 * @param i1 l'indice i du premier �l�ment
	 * @param j1 l'indice j du premier �l�ment
	 * @param i2 l'indice i du deuxi�me �l�ment
	 * @param j2 l'indice j du deuxi�me �l�ment
	 */
	public static void echange(int[][] tab, int i1, int j1, int i2, int j2) {
		
		int temp = tab[i1][j1];
		tab[i1][j1] = tab[i2][j2];
		tab[i1][j1] = temp;
	}
	

}
