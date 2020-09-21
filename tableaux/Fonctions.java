package tableaux;

import java.util.Random;

public class Fonctions {
	/**
	 * Creer et retourn une tableau des deux dimension de 10x10
	 * avec valeurs aléatoires
	 * {{1,2      9,10}
	 *  {1,2      9,10}
	 *  
	 *  {1,2      9,10}}
	 * 
	 * @return  un tableau des integers
	 */
	public static int[][] creerTableauDeDeuxDimension() {
		Random random = new Random();
		int[][] tab = new int[10][10];
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++) {
				tab[i][j] = random.nextInt(10 - 1 + 1) + 1;
			}
		}
		return tab;
	}
	
	/**
	 * Affiche tous les valeurs d'un tableau de deux dimensions
	 * 
	 * @param tableau   un tableau de deux dimensions
	 */
	public static void afficheTableauDeuxDimensions(int[][] tableau) {
		for (int i = 0; i < tableau.length; i++) {
			for (int j = 0; j < tableau[i].length; j++) {
				if (tableau[i][j] > 9) {
					System.out.print(tableau[i][j] + "   ");
				}
				else {
					System.out.print(" " + tableau[i][j] + "   ");
				}
				
			}
			System.out.println();
		}
	}
	
	

}
