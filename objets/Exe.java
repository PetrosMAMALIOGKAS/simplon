package objets;

public class Exe {

	public static void main(String[] args) {
		System.out.println("Bonjour vous desirez quel menu?");
		System.out.println("1. Menu Poulet");
		System.out.println("2. Menu Boeuf");
		System.out.println("3. Menu Vegetarien");
		System.out.println("Votre choix...");
		int choixUtilisateur = Fonctions.readNumber();
		switch (choixUtilisateur) {
		case 1:
			MenuPoulet menuPoulet = new MenuPoulet();
			break;
		case 2:
			MenuBoeuf menuBoeuf = new MenuBoeuf();
			break;
		case 3:
			MenuVegetarien menuVegetarien = new MenuVegetarien();
			break;
		default :
			System.out.println("Erreur inconnu....");
			break;
			
		}

	}

}
