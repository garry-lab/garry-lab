package Jean_Garry_java_devoir#1;

public class devoir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Devoir #1 de JEAN Garry
		
double montant_a_economiser = 285000; //total a economiser

double economie_par_jour = 2500;     //economie par jour

double taxe = 0.15;               // taux taxe

double y = montant_a_economiser + ( montant_a_economiser*taxe);//montant necessaire pour achter l'iphone

double nombrejours =  y/economie_par_jour;// nombre de jours necessaire pour economiser y



System.out.println("Le nombre de jours necessaire pour economiser   " + montant_a_economiser+ "  plus 15% taxes pour acheter l'iphone     est :  " + nombrejours  );
		


	}

}
