package objets;

public class MenuPoulet {
	public int prix =9;
	public Accompagnement[] listDeAccompagnements =new Accompagnement[3];
	public Boisson[] listDeBoissons = new Boisson[3];
	public Accompagnement accompagnementChoisi;
	public Boisson boissonChoisi;
	
	public MenuPoulet() {
		Accompagnement riz = new Accompagnement("riz");
		Accompagnement legumes = new Accompagnement("legumes");
		Accompagnement frites = new Accompagnement("frites");
		this.listDeAccompagnements[0] = riz;
		this.listDeAccompagnements[1] = legumes;
		this.listDeAccompagnements[2] = frites;
		Boisson eauPlate = new Boisson("eau plate");
		Boisson eauGazose = new Boisson("eau gazose");
		Boisson soda = new Boisson ("soda");
		this.listDeBoissons[0] = eauPlate;
		this.listDeBoissons[1] = eauGazose;
		this.listDeBoissons[2] = soda;
		
		this.afficheAccompagnements();
		this.choixDeAccompagnement();
		
		System.out.println();
		this.afficheBoissons();
		this.choixDeBoisson();
		
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
		
		public void choixDeBoisson() {
			int nombreTotalDesBoissons = this.getNombreDesBoissons();
			int choixUtilisateur;
			do {
				System.out.println("Votre choix...");
				choixUtilisateur = Fonctions.readNumber();
			} while (choixUtilisateur < 1 && choixUtilisateur < (nombreTotalDesBoissons + 1));
			
			boissonChoisi = this.listDeBoissons[choixUtilisateur -1];
		}
		
		public void afficheAccompagnements() {
			int counter = 1;
			for (Accompagnement a : this.listDeAccompagnements) {
				System.out.println(counter + ". " + a.getDesignation());
				counter++;
			}
		}
		
		public void afficheBoissons() {
			int counter = 1;
			for (Boisson a : this.listDeBoissons) {
				System.out.println(counter + ". " + a.getDesignation());
				counter++;
			}
		}
		
		
		
		public int getNombreDesAcompagnements() {
			return this.listDeAccompagnements.length;
		}
		
		public int getNombreDesBoissons() {
			return this.listDeBoissons.length;
		}
		
		public String toString() {
			String s = "Vous avez pris un menu poulet avec \n" + this.accompagnementChoisi.getDesignation() + " comme accompagnement \n" 
															 + this.boissonChoisi.getDesignation() + " comme boisson \n";
			return s;
		
		}
	
		
	}

