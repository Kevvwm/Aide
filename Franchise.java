package MonPackage;

public class Franchise
{
	public static void main(String args[]) {
		double mt, franchise;
		/*Cette algorithme, disponible pour une société d'assurances, développe le traitement suivant : 
		- déclare 2 variables numériques qui vont recevoir le montant
		- Saisie du montant engagé par l'utilisateur
		- Calcul de la franchise qui correspond à 10 % du montant engagé
		- On teste la franchise
		
			2 cas :  Si franchise < 350 alors on la force à 350,00€
					 Si franchise > 650 alors on la force à 650,00€
		- Affichage du montant de la franchise 
		*/
		mt = Saisie.lire_double("Quel est le montant des frais engagés ?");
		franchise = mt * 0.10;
		if(franchise<350) franchise = 350;
		else if(franchise>650) franchise = 650;
		System.out.println("La franchise est de " + franchise + " € " );
		
	}

}