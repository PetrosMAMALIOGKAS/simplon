package conditions;



public class Calculatrice {
	public static void main(String[] args) {
		int premierNombre = Fonctions.readNumber();
		int deuxiemeNombre = Fonctions.readNumber();
		System.out.println("a = " +  premierNombre + ", b= " + deuxiemeNombre);
		String operateur = Fonctions.readOperateur();
		int resultat;
		
		switch (operateur) {
		case "+" :
			resultat = premierNombre + deuxiemeNombre;
			System.out.println( premierNombre + " + " + deuxiemeNombre + " = " + resultat);
			break;
		case "-" :
			resultat = premierNombre - deuxiemeNombre;
			System.out.println( premierNombre + " - " + deuxiemeNombre + " = " + resultat);
			break;
		case "/" :
			try {
				resultat = premierNombre / deuxiemeNombre;
				System.out.println( premierNombre + " / " + deuxiemeNombre + " = " + resultat);
			}
			catch (Exception e) {
				System.out.println("Je ne peux pas diviser par 0");
			}
			break;
		case "%" :
			try {
				resultat = premierNombre % deuxiemeNombre;
				System.out.println( premierNombre + " % " + deuxiemeNombre + " = " + resultat);
			}
			catch (Exception e) {
				System.out.println("Je ne peux pas diviser par 0");
			}
			break;
		default :
			System.out.println("erreur d'execution");
		}
	}

}
