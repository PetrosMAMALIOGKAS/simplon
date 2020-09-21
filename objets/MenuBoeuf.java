package objets;

public class MenuBoeuf {
	public int prix = 9;
	public Accompagnement[] listDeAccompagnements =new Accompagnement[3];
	public Accompagnement accompagnementChoisi;
	
	public MenuBoeuf() {
		Accompagnement riz = new Accompagnement("riz");
		Accompagnement legumes = new Accompagnement("legumes");
		Accompagnement frites = new Accompagnement("frites");
		this.listDeAccompagnements[0] = riz;
		this.listDeAccompagnements[1] = legumes;
		this.listDeAccompagnements[2] = frites;
		
		this.afficheAccompagnements();
		this.choixDeAccompagnement();
		
		System.out.println(this.toString());
	}
	
	public void choixDeAccompagnement() {
		int nombreTotalDesAccompagnement = this.getNombreDesAcompagnements();
		int choixUtilisateur;
		do {
			System.out.println("Votre choix...");
			choixUtilisateur = Fonctions.readNumber();
		} while (choixUtilisateur < 1 && choixUtilisateur < (nombreTotalDesAccompagnement + 1));
		
		accompagnementChoisi = this.listDeAccompagnements[choixUtilisateur -1];
	}
	
	public void afficheAccompagnements() {
		int counter = 1;
		for (Accompagnement a : this.listDeAccompagnements) {
			System.out.println(counter + ". " + a.getDesignation());
			counter++;
		}
	}
	
	public int getNombreDesAcompagnements() {
		return this.listDeAccompagnements.length;
	}
	
	public String toString() {
		String s = "Vous avez pris un menu boeuf avec \n" + this.accompagnementChoisi.getDesignation() + " comme accompagnement"; 
		return s;
	
	}

	
	
	

}
