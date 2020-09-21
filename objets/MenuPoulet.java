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

		}
	
		
	}

