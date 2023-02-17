package MonPackage;

public class EXpVecteur_Predefini 
{

	public static void main(String[] args)
	{
		String Ville [] = {"Brest","paris", "Dijon", "Lyon"};
		int Mat [][] = { {1,1,1,1,},{2,2,2,2},{3,3,3,3}};
		
		for (int I = 0; I< Ville.length; I++) System.out.print( Ville [I]+"  ");
		System.out.println("La taille du vecteur est "+Ville.length );
		System.out.println();
		System.out.println("Le nombre de lignes   est "+Mat.length+" lignes" ); 
		System.out.println("Le nombre de colonnes   est "+ Mat[0].length +" colonnes" ); 
		
		  
			
		

	}

}
