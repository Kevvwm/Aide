package MonPackage;

public class Jeu_de_dés_corrigé 
{
	public static void main(String[] args) 
	{
		int Tour, Jet, Score1 = 0, Score2 = 0, Total1, Total2;
		String Continuer;
		String Prenom1 = Saisie.lire_String("Saisir le nom du premier joueur :");
		String Prenom2 = Saisie.lire_String("Saisir le nom du second joueur :");
		System.out.println("Tirage du premier des deux joueurs à lancer le dé...");
		Continuer = Saisie.lire_String("======= Tapez sur entrer pour continuer =======");
		Tour = 1 + (int) (Math.random() * 2);
		if (Tour == 1)
		{
			System.out.println(Prenom1 + " joue en premier :");
		}
		else System.out.println(Prenom2 + " joue en premier :");
		{
			Jet = 1 + (int) (Math.random() * 6);
			Score2 = Jet;
			System.out.println(Prenom2 + " lance le dé et fait un score de " + Jet + " son score total est maintenant de " + Score2);
			
			while (Jet == 6)
			{
				Jet = 1 + (int) (Math.random() * 6);
				Score2 = Score2 + Jet;
				System.out.println("Le score sur le dé étant de 6, le dé se relance une seconde fois et fait " + Jet);
				System.out.println("Le total des points de " + Prenom2 + " est maintenant de " + Score2);
				
			}
			System.out.println("");
		}
	do
	{
		Continuer = Saisie.lire_String("======= Tapez sur entrer pour continuer =======");
		System.out.println("C'est au tour de " + Prenom1 + " de jouer :");
		Jet = 1 + (int) (Math.random() * 6);
		Score1 = Score1 + Jet;
		System.out.println(Prenom1 + " lance le dé et fait un score de " + Jet + " son score total est maintenant de " + Score1);
		
		while (Jet == 6)
		{
			Jet = 1 + (int) (Math.random() * 6);
			Score1 = Score1 + Jet;
			System.out.println("Le score sur le dé étant de 6, le dé se relance une seconde fois et fait " + Jet);
			System.out.println("Le total des points de " + Prenom1 + " est maintenant de " + Score1);
			
		}
		System.out.println("");
		if (Score1 < 30)
		{
			Continuer = Saisie.lire_String("======= Tapez sur entrer pour continuer =======");
			System.out.println("C'est au tour de " + Prenom2 + " de jouer :");
			Jet = 1 + (int) (Math.random() * 6);
			Score2 = Score2 + Jet;
			System.out.println(Prenom2 + " lance le dé et fait un score de " + Jet + " son score total est maintenant de " + Score2);
			
			while (Jet == 6)
			{
				Jet = 1 + (int) (Math.random() * 6);
				Score2 = Score2 + Jet;
				System.out.println("Le score sur le dé étant de 6, le dé se relance une seconde fois et fait " + Jet);
				System.out.println("Le total des points de " + Prenom2 + " est maintenant de " + Score2);
				
			}
			System.out.println("");
			
		}
	}
	while (Score1 < 30 && Score2 < 30);
	if 
	(Score1 >= 30)
	{
		System.out.println("Le vainqueur est " + Prenom1 + " avec un score de " + Score1 + " !");
	}
	else
	{
		System.out.println("Le vainqueur est " + Prenom2 + " avec un score de " + Score2 + " !");
	}
	}
}
