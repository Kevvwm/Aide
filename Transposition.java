package MonPackage;

public class Transposition
{
			public static void main(String[] args)
			{
			int tab[] = { 7, 5, 1, 2, 3, 4 };
			 int N, J, I, temp;

			N = tab.length;
			
			System.out.println("Voici le tableau à trier : ");

			for (I = 0; I < N ; I++) 
			{
				System.out.print(tab[I] + "\t");
			}
			I = 0;
			while (I < N-1) 
			{
			if (tab[I] > tab[I+1])
			{
				temp = tab[I];
			    tab[I] = tab[I+1];
			    tab[I+1] = temp ;
			
			    J = I-1;
			    while ( J >= 0)
			    {
			    	if (tab[J] > tab[ J + 1])
			    	{
			    		temp = tab[J];
			    		tab[J] = tab[J+1];
			    		tab[J+1] = temp;
			    		J = J+1;
			    		
			    	}
			    	else J = -1;
			    }
			   		
			}
			 I = I+1;
			}
			System.out.println();
			 System.out.println("Voici le tableau trié :");
			 
			 for (I = 0; I < N ; I++) 
				{
					System.out.print(tab[I] + "\t");
				}
	}
}

