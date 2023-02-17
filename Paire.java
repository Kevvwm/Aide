package MonPackage;

public class Paire 
{

	public static void main(String[] args)
	{
		int Nb;
		boolean test;
		Nb = Saisie.lire_int("Veuillez entrez un nombre : ");
		test = Paire (Nb);
		if (test == true)System.out.println("Le nombre Saisi est bien Pair");
		else System.out.println("Le nombre Saisi est bien impair ");
		
	}
	public static boolean Paire (int A) {
		int reste;
		boolean Res;
		
		reste = A % 2;
		if (reste == 0) Res=true;
		else Res = false;
		return Res;
	}

}
