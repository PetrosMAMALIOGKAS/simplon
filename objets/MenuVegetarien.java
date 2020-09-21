package objets;

import java.util.Arrays;

public class MenuVegetarien {
	public Boisson[] listDeBoissons = new Boisson[3];
	public Boisson boissonChoisi;
	public Accompagnement[] accompagnementsChoisi = new Accompagnement[2];
	
	public MenuVegetarien() {
		Boisson eauPlate = new Boisson("eau plate");
		Boisson eauGazose = new Boisson("eau gazose");
		Boisson soda = new Boisson ("soda");
		this.listDeBoissons[0] = eauPlate;
		this.listDeBoissons[1] = eauGazose;
		this.listDeBoissons[2] = soda;
		
		
		Accompagnement legumes = new Accompagnement("legumes");
		this.accompagnementsChoisi[0] = legumes;
		System.out.println("Vous voulez du riz avec vootre menu?");
		System.out.println("1. Oui");
		System.out.println("2. Non");
		System.out.println("Votre choix ?");
		int choix = Fonctions.readNumber();
		if (choix == 1) {
			Accompagnement riz = new Accompagnement("riz");
			this.accompagnementsChoisi[1] = riz;
		}
		
		this.afficheBoissons();
		this.choixDeBoisson();
		System.out.println();
		
		System.out.println(this.toString());
	}
	
	public void choixDeBoisson() {
		int nombreTotalDesBoissons = this.getNombreDesBoissons();
		int choixUtilisateur;
		do {
			System.out.println("Votre choix...");
			choixUtilisateur = Fonctions.readNumber();
		} while (choixUtilisateur < 1 && choixUtilisateur < (nombreTotalDesBoissons + 1));
		
		boissonChoisi = this.listDeBoissons[choixUtilisateur -1];
	}
	
	public void afficheBoissons() {
		int counter = 1;
		for (Boisson a : this.listDeBoissons) {
			System.out.println(counter + ". " + a.getDesignation());
			counter++;
		}
	}
	
	public int getNombreDesBoissons() {
		return this.listDeBoissons.length;
	}
	
	public String toString() {
		String s = "Vous avez pris un menu vegeterien avec des legumes ";
		if (accompagnementsChoisi[1] != null) {
			s = s + " et du riz "; 
		}
		s = s + " comme accompagnement \n" + 
        " et " +  this.boissonChoisi.getDesignation() + " comme boisson \n";
		return s;
	
	}
}
