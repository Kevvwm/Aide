package MonPackage;

public class Table_Multiplication 
{

	public static void main(String[] args) 
	{
		int nbre;
		
		nbre = Saisie.lire_int("Veuillez saisir un nombre compris entre 2 et 12");
		while ((nbre<2) || (nbre>12)){
			nbre = Saisie.lire_int("Veuillez saisir un nombre compris entre 2 et 12");
			
		}
		TabMulti(nbre);
		

	}
	
public static void TabMulti( int nbreBis)
{
	int I;
	System.out.println("La table de multiplication de \", nbreBIS, \" est la suivante ");
	for (I = 1 ; I<=10 ;I++) {
		System.out.println(nbreBis + " x "+ I +" = "+ nbreBis * I);
	}
}
	



}
