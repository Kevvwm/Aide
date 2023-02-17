package MonPackage;

public class Matrice_Vecteur 
{

	public static void main(String[] args)
	{
	// Déclaration des variables et des variables indicées	
       int IndL, IndC, N, IndV, Nb, L, C;
       int Mat[][], Tab[];
       
       
       L= Saisie.lire_int("Quel est le nombre de lignes de la matrice ?");
       C = Saisie.lire_int("Quel est le nombre de colonnes de la matrice ?");
       N  = L * C;
              
       // Instanciation des variables indicées
       
       Mat = new int [L][C];
       Tab = new int [N];
       
    // remplissage automatique de la matrice
	   Nb = 1;
	  for(IndL = 0; IndL < L; IndL ++)
	  {
		  for(IndC = 0; IndC < C; IndC ++)
		  {
			   Mat[IndL][IndC]  = Nb;
			   Nb = Nb +1;
		  }
	  }	 
      
	// Transfert de la matrice dans le vecteur
	   IndV = 0;
	   for(IndL = 0; IndL < L; IndL ++)
		  {
			  for(IndC = 0; IndC < C; IndC ++)
			  {
				    Tab[IndV] = Mat[IndL] [IndC]  ;
				   IndV  = IndV +1;
			  }
		  }	 
	// Affichage du résultat
	System .out.println(" Voici la matrice ")  ; 
	 for(IndL = 0; IndL < L; IndL ++)
	  {
		  for(IndC = 0; IndC < C; IndC ++)
		  {  
			  if (Mat[IndL][IndC] < 10) System.out.print( "0" +Mat[IndL] [IndC] +" |" );
		      else System.out.print( Mat[IndL] [IndC] +" |" );
		  }
		  System.out.println();
	  }	    
	   
	 System.out.println(); 
	 System .out.println(" Voici le vecteur ")  ; 
	 for(IndV = 0; IndV < N; IndV ++)
	  { 
		 System.out.print( Tab[IndV] +" |" );
	  }
	   
		   
	}

}
