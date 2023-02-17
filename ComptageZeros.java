package MonPackage;

public class ComptageZeros {

	public static void main(String[] args) 
	{
		int Tab[], N, I;
		
		N = Saisie.lire_int("Veuillez saisir la taille du tableau strictement supérieure à 5 : ");
		
		while(N <= 5)
		{
			N = Saisie.lire_int("Erreur de saisie, veuillez recommencer : ");
		}
		
		Tab = new int[N];
		
		for(I = 0; I < N; I++)
		{
			Tab[I] = Saisie.lire_int("Veuillez saisir votre nombre au rang " + (I+1) + " : ");
		}
		
		Comptage(Tab, N);
		
	}
	
	public static void Comptage(int TabBis[], int NBis) 
	{
		int J, compteur = 0;
		
		for(J = 0; J < NBis; J++)
		{
			if(TabBis[J] == 0) compteur++;
		}
		
		
		System.out.println("Le tableau contient " + compteur + " zéros.");
	}

}
