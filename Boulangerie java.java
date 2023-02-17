package MonPackage;

public class Boulangerie {

	//Algorithme principal
	public static void main(String[] args) 
	{
		int H, I, Heure;
		boolean Boucle;
		String Semaine [] = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"}, Jour = "Jour";
		
		//Affichage des jours de la semaine
		System.out.println("Liste des jours de la semaine :");
		for (H = 0; H <= 6 ; H++)
		{
			System.out.print(Semaine[H] + " | ");
		}
		System.out.println("");
		System.out.println("");
		 
		//Saisie et contr�le de saisie du jour
		Boucle = true;
		I = 0;

		while (Boucle == true)
		{
		    Jour = Saisie.lire_String("Veuillez saisir un jour de la semaine :");
		    while ((I < 7) && (Jour.equals (Semaine[I])== false ))
		    { 
		    	I++;
		    }
		    if (I == 7)
		    {
		    	System.out.println("Le jour " + Jour + " n'existe pas ou est mal orthographi�");
		    	I = 0;	
		    }
	        else
	        {
	        	System.out.println("Saisie correcte");
	        	Boucle = false;
	        }
		}
		System.out.println("");
		
		//Saisie et contr�le de saisie de l'heure
		Heure = Saisie.lire_int("Veuillez saisir l'heure � laquelle vous souhaitez v�rifier si la boulangerie est ouverte :");
		
		while ((Heure > 23 || Heure < 0))
		{
			System.out.println("Saisie de l'heure incorrecte");
			Heure = Saisie.lire_int("Veuillez saisir l'heure � laquelle vous souhaitez v�rifier si la boulangerie est ouverte :");
		}
		
		Boulangerie(Jour, Heure);
	}
	
	//Fonction qui v�rifie et renvoie l'�tat de la boulangerie � l'heure et au jour donn�e
	public static boolean Boulangerie(String JourBis, int HeureBis)
	{
		boolean Ouvert;
		Ouvert = false;
		

		//à modifier pour le faire comme sur l'algorithme
		if (JourBis.equals("Lundi"))
		{
			System.out.println("La boulangerie est ferm�e toute la journ�e le lundi");
		}
		
		else if ((HeureBis >= 7 && HeureBis <= 13 && JourBis != "Lundi"))
		{
			System.out.println("La boulangerie est ouverte");
		}
		
		else if ((HeureBis >= 16 && HeureBis <= 19 && JourBis != "Lundi" && JourBis != "Dimanche"))
		{
			System.out.println("La boulangerie est ouverte");
		}
		
		else if ((HeureBis >= 16 && HeureBis <= 19 && JourBis == "Dimanche"))
		{
			System.out.println("La boulangerie est ouverte");
		}
		
		return Ouvert;
	}

}
