package objets;

public class MenuBoeuf {
	public int prix =9;
	public Accompagnement[] listDeAccompagnements =new Accompagnement[3];
	public Accompagnement accompagnementChoisi;
	
	public MenuBoeuf() {
		Accompagnement riz = new Accompagnement();
		Accompagnement legumes = new Accompagnement("legumes");
		Accompagnement frites = new Accompagnement("frites");
		this.listDeAccompagnements[0] = riz;
		this.listDeAccompagnements[1] = legumes;
		this.listDeAccompagnements[2] = frites;
	}
	
	

}
