package objetsCapitale;

public class Ville {
	
	private String nom;
	private int nombreHabitants;
	
	public Ville(String nomVille) {
		this.nom = nomVille;
	}
	
	public Ville(String nomVille, int nombreHabitants) {
		this.nom = nomVille;
		this.nombreHabitants = nombreHabitants;
	}
	
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public int getNombreHabitants() {
		return nombreHabitants;
	}
	
	public void setNombreHabitants(int nombreHabitants) {
		this.nombreHabitants = nombreHabitants;
	}
	
	@Override
	public String toString() {
		
		String s = String.format("Ville     : %s\nHabitants : %s\n",
								   this.nom, 
								   (this.nombreHabitants != 0)
								   		? Integer.toString(this.nombreHabitants)
										: "inconnu"
								);
								
		return s;
	}

}
