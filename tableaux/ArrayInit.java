package tableaux;

public class ArrayInit {
	public static void main(String[] args) {
		int[] tab = {1,2,3,4,5,6,7,8,9,10};
		int[] tab1 = new int[10];
		for (int i=0; i < tab1.length; i++) {
			tab1[i] = i+1;
		}
		
		System.out.println("La somme des valeurs du tableau egal � " + calculeSomme(tab1));
		
		System.out.println("L'�l�ment 3 se trouve � l'indice " + chercheElement(tab, 3));

	}
	
	/**
	 * Retourne la somme des valeurs du Array pass� en param�tre 
	 * 
	 * @param tableau Un Array de integers
	 * @return        la somme des valeurs
	 */
	public static int calculeSomme(int[] tableau) {
		
		int somme = 0;
		for (int i = 0; i < tableau.length; i++) {
			somme += tableau[i];
		}
		return somme;
	}
	
	/**
	 * Retourne l'indice du premier occurence d'�l�ment recherch�
	 * 
	 * @param tableau    le tableau dans lequel on cherche
	 * @param element    le �l�ment qu'on cherche
	 * @return           l'indice du premier occurence si l'�l�ment est trouv�
	 *                      -1 si on ne trouve pas l'�l�ment dans le tableau 
	 */
	public static int chercheElement(int[] tableau, int element) {
		
		for (int i = 0; i < tableau.length; i++) {
			if (tableau[i] == element) {
				return i;
			}
		}
		return -1;
	}

}
