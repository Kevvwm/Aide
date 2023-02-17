public class PurgePhrase {

	public static void main(String[] args) 
	{
		int taille;
		String phrase, caract, phrasefinale, extract;
		
		phrase = Saisie.lire_String("Quelle est votre phrase terminée par un point : ");
		
		taille = phrase.length();
		extract = phrase.substring(taille-1, taille);
		
		while(extract.equals(".") == false)
		{
			phrase = Saisie.lire_String("Terminez votre phrase par un point ! On recommence : ");
			taille = phrase.length();
			extract = phrase.substring(taille-1, taille);
		}
		
		System.out.println("Avant la purge, votre phrase est " + phrase);
		
		caract = Saisie.lire_String("Quel caractère voulez-vous purger ? : ");
		
		phrasefinale = Purge(phrase, caract);
		
		System.out.println("Après la purge, votre phrase est " + phrasefinale);
	}
	
	public static String Purge(String phraseBIS, String caractBIS)
	{
		String phrasearetourner, extractBIS;
		int longueurBIS, I;
		
		longueurBIS = phraseBIS.length();
		phraseBIS = phraseBIS.toLowerCase();
		//System.out.println(phraseBIS);
		phrasearetourner = "";
		for(I = 0; I < longueurBIS; I++)
		{
			extractBIS = phraseBIS.substring(I, I+1);
			if(extractBIS.equals(caractBIS) == false)
			{
				phrasearetourner = phrasearetourner + extractBIS;
			}
		}
		
		return phrasearetourner;
	}

}
