package operateurs;

import java.math.BigDecimal;

public class Monnaies {
	public static void main(String[] args) {
		boolean flag = true;
		double number =  Math.random();
		
		String a = String.format("%.2f" , number);
		a = a.replace(",",".");
		System.out.println("On analyse le nombre " + a);
		
		BigDecimal somme = new BigDecimal(a);
		
		String[] monnaies = {
							"cinquante",
							"vingth",
							"dix",
							"cinq",
							"deux",
							"un"
							};
		
		double[] num = {0.5, 0.2, 0.1, 0.05, 0.02, 0.01};
		
		int[] numDeMonnaies = {0, 0, 0, 0, 0, 0};
		
		for (int i = 0; i <= 5; i++) {
			boolean drapeau = true;
			
			do {
				int comparison;
				comparison = somme.compareTo(BigDecimal.valueOf(num[i]));
				
				if (comparison == 1 || comparison == 0) {   // somme est plus grand ou egal
					numDeMonnaies[i]++;
					somme = somme.subtract(BigDecimal.valueOf(num[i]));
				}
				else {
					drapeau = false;
				}
			} while (drapeau);
			
			System.out.println(numDeMonnaies[i] + " pieces de " + monnaies[i] + " centimes reste de " + somme);
		}

	}
}
