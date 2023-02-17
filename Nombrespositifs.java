package MonPackage;

public class Nombrespositifs {

	public static void main(String[] args) {
		int nb, C = 0;
		String reponse;
		
		
		do {
			nb = Saisie.lire_int("Veuillez entrer un nombre : ");
			if(nb > 0) C++;
			reponse = Saisie.lire_String("Voulez-vous continuer? Répondez par Oui ou par Non");
		} while(reponse.equals("Non") == false);
		
		System.out.println("Vous avez saisi " + C + " nombres poisitfs");
	}

}
