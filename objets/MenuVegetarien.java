package objets;

public class MenuVegetarien {
	public Boisson[] listDeBoissons = new Boisson[3];
	public Accompagnement[] listDeAccompagnements =new Accompagnement[2];
	public Boisson boissonChoisi;
	public Accompagnement[] accompagnementChoisi;
	
	public MenuVegetarien() {
		Boisson eauPlate = new Boisson("eau plate");
		Boisson eauGazose = new Boisson("eau gazose");
		Boisson soda = new Boisson ("soda");
		this.listDeBoissons[0] = eauPlate;
		this.listDeBoissons[1] = eauGazose;
		this.listDeBoissons[2] = soda;
		Accompagnement riz = new Accompagnement("riz");
		Accompagnement legumes = new Accompagnement("legumes");
		this.listDeAccompagnements[0] = riz;
		this.listDeAccompagnements[1] = legumes;
		this.accompagnementChoisi[0] = legumes;
	}
}
