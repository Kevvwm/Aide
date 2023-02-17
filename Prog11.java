package mon_package;

public class Prog11 {

	public static void main(String[] args) {
		int a,b,c,tot,choix;
		
		a = Saisie.lire_int("Veuillez saisir 3 nombre de votre choix ");
		b = Saisie.lire_int("Veuillez saisir 3 nombre de votre choix ");
		c = Saisie.lire_int("Veuillez saisir 3 nombre de votre choix ");
		
		System.out.println("Menu : ");
		
		System.out.println("Tapez 1 Si vous voulez faire la somme");
		System.out.println("Tapez 2 Si vous voulez faire le produit");
		System.out.println("Tapez 3 Si vous voulez faire la moyenne");
		
		choix = Saisie.lire_int("Tapez votre choix !");
		
		switch(choix) {
		case 1:{
					tot = a+b+c;
					System.out.println("La somme est :"+ tot);
			        break;
			    }
			
		case 2:{
			tot = a*b*c;
		System.out.println("Le produit est :"+ tot);
			break;}
			
		case 3 :{
			tot = (a+b+c)/3;
		System.out.println("La moyenne est : "+ tot);
			break;}
			
		default: System.out.println("Erreur de saisie"); 
		
		}
	}

}
