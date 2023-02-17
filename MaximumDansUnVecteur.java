package MonPackage;

public class PlusGrandElementDansUnTableau {

	public static void main(String[] args) {
		int Max, N, Rang, I, tab [];
		
		N = Saisie.lire_int("Veuillez saisir N strictement supérieur a 5 : ");
		
		while(N <= 5) {
			N = Saisie.lire_int("Erreur de saisie : veuillez resaisir : ");
		}
		
		tab = new int[N];
		
		for(I = 0; I < N; I++) {
			tab[I] = Saisie.lire_int("Veuillez saisir au rang " + (I + 1) + " : ");
		}
		
		Max = tab[0];
		Rang = 0;
		
		for(I = 1; I < N; I++) {
			if(Max < tab[I]) {
				Max = tab[I];
				Rang = I;
			}
		}
		
		System.out.println("La valeur maximale du tableau est " + Max + " et elle se trouve au rang " + (Rang + 1));
	}

}
