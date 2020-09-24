package objetsCapitale;

import java.util.ArrayList;

public class Exe {

	public static void main(String[] args) {
		Ville v1 = new Capitale("Paris", 2200000, "France");
		Ville v2 = new Capitale("Athens");
		Ville v3 = new Ville("Marseil");
		Ville v4 = new Ville("Thessalonique" , 1000000);
		
		ArrayList<Ville> listDeVilles = new ArrayList<Ville>();
		listDeVilles.add(v1);
		listDeVilles.add(v2);
		listDeVilles.add(v3);
		listDeVilles.add(v4);
		 
		for (Ville e: listDeVilles ) {
			if (e instanceof Capitale)
			System.out.println(e.toString());
		}
		
		
		

	}

}
