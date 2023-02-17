public class Exo10 {

	public static void main(String[] args) {
		
		int X1, X2, X3, choix;
		float moyenne;
		int addition, multiplication;
		
		X1 = Saisie.lire_int("Veuillez entrer votre premier nombre : ");
		X2 = Saisie.lire_int("Veuillez entrer votre premier nombre : ");
		X3 = Saisie.lire_int("Veuillez entrer votre premier nombre : ");
		choix = Saisie.lire_int("Tapez 1 pour faire une addition, 2 pour une mulitplication ou 3 pour une moyenne : ");
		
		addition = X1+X2+X3;
		multiplication = X1*X2*X3;
		moyenne = addition/3;
		
		switch(choix) {
			case 1 : 
				System.out.println("Le résultat de l'addition de vos 3 nombres est : " + addition);
				break;
			case 2 :
				System.out.println("Le résultat du produit de vos 3 nombres est : " + multiplication);
				break;
			case 3 : 
				System.out.println("Le résultat de la moyenne de vos 3 nombres est : " + moyenne);
				break;
			default:
				System.out.println("Erreur de saisie");
				break;
		}
	}

}
