package objetsCapitale;

public class Capitale extends Ville {
	
	private Pays pays;

	public Capitale(String nomVille) {
		super(nomVille);	
	} 
	
	public Capitale(String nomVille, int nombreHabitants) {
		super(nomVille, nombreHabitants);
	}
	
	public Capitale(String nomVille, int nombreHabitants, String pays) {
		super(nomVille, nombreHabitants);
		this.pays = new Pays(pays);
	}
	
	@Override
	public String toString() {
		String s = (this.pays != null)
			    ? String.format("Capitale de la %s", this.pays.getNomPays())
			    : "Pays n'a pas été declaré";
		return super.toString() + s;
				
	}
	

}
