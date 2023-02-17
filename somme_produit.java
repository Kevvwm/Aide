package MonPackage;

public class somme_produit {

	public static void main(String[] args) {
		int a, b;
		
		a = Saisie.lire_int("Veuillez saisir vos deux nombres (a)");
		b = Saisie.lire_int("Veuillez saisir vos deux nombres (b)");
		
		Calcul(a, b);

	}
	
	public static void Calcul (int aBIS, int bBIS) {
		int somme, multi;
		
		somme = aBIS + bBIS;
		multi = aBIS * bBIS;
		
		System.out.println("La somme de vos deux nombres est "+somme);
		System.out.println("Le produit de vos deux nombres est "+multi);
		
		if (somme < 0) System.out.println("La somme de vos deux nombres est "+somme+" et c'est une somme négative ");
		else System.out.println("La somme de vos deux nombres est"+somme+ "et c'est une somme positive");
		
		if (multi < 0) System.out.println("Le produit de vos deux nombres est"+multi+" et c'est un produit négatif ");
		else System.out.println("Le produit de vos deux nombres est"+multi+ "et c'est un produit positif");
		
			
	}

}
