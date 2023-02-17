package MonPackage;

public class TroisNombres
{

	public static void main(String[] args)
	{
		//Déclaration et saisie
      int X1, X2, X3, Res;
      X1 = Saisie.lire_int("Entrez un  premier nombre");
      X2 = Saisie.lire_int("Entrez un  deuxième nombre");
      X3 = Saisie.lire_int("Entrez un  troisième nombre");
      
      // Appel de la procédure Moyenne
      Moyenne (X1, X2, X3);
       // Appel d'une fonction
      Res = Multi ( X1, X2, X3);
      System.out.println();
      System.out.println("le produit de vos 3 nombres est de  "+ Res);
      
	}
	// Ecriture de la procédure Moyenne
	 public static  void Moyenne (int A, int B, int C)
	 {
		 double  Moy;
		 Moy = (A + B + C)/3;
		 System.out.println("La moyenne de vos 3 nombres est  "+Moy);
	 }
// Ecriture de la fonction Multi
	 public static  int Multi (int A, int B, int C) 
	 { 
		 int Resultat;
		 Resultat = A * B * C;
		 return Resultat;
		 
	 }
	 
}
