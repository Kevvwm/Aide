package variablesindicees;

public class TPosNeg {

	public static void main(String[] args) {
		/*
		 Le tableau ne contera aucun zéro
		 Transférer élem positifs du tableau tab dans un vecteur nommé (tpositif)
		 Transférer élem négatifs du tableau tab dans un vecteur nommé (tnégatif)
		 Les 3 tableaux ont la même taille N
		 tpositif et tnegatif sera compté a zéro
		*/
		
		int N, I, Pos, Neg, tab [], TPositif [], TNegatif [];
		
		N = Saisie.lire_int("Veuillez saisir le nombre de cases n : ");
		
		tab = new int[N];
		TPositif = new int[N];
		TNegatif = new int[N];
		
		
		//Remplissage du tableau
		for(I = 0; I < N; I++) {
			tab[I] = Saisie.lire_int("Veuillez saisir au rang " + (I + 1) + " une valeur différente de 0 : ");
			while(tab[I] == 0) {
				tab[I] = Saisie.lire_int("Erreur de saisie. Veuillez resaisir votre nombre : ");
			}
		}
		
		
		//Remplissage de 0
		for(I = 0; I < N; I++) {
			TPositif[I] = 0;
			TNegatif[I] = 0;
		}
		
		
		//Eclatement du tableau
		Pos = 0;
		Neg = 0;
		
		for(I = 0; I < N; I++) {
			if(tab[I]<0) {
				TNegatif[Neg] = tab[I];
				Neg = Neg + 1;
			}
			else {
				TPositif[Pos] = tab[I];
				Pos = Pos + 1;
			}
		}
		
		
		
		//Affichage des tableaux
		System.out.println("Le tableau initial est le suivant : ");
		for(I = 0; I < N; I++) {
			System.out.print(tab[I] + " | ");
		}
		System.out.println(" ");
		System.out.print("Le tableau positif est le suivant : ");
		System.out.println("\n");
		for(I = 0; I < N; I++) {
			System.out.print(TPositif[I] + " | ");
		}
		System.out.println(" ");
		System.out.println("Le tableau négatif est le suivant : ");
		for(I = 0; I < N; I++) {
			System.out.print(TNegatif[I] + " | ");
		}
	}

}
