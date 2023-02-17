package MonPackage;

public class Demi_Pyramide 
{

	public static void main(String[] args) 
	{
		String Mot, Extract;
		int taille, i;
		Mot = Saisie.lire_String("Saisissez votre mot : ");
		
		taille = Mot.length();
		
		for(i = 0; i <= taille ; i++) {
			Extract = Mot.substring(0, i);
			System.out.println(Extract);
		}

	}