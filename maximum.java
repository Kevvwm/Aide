package MonPackage;

public class maximum {

	public static void main(String[] args) {

		int num,A,B,C,res;
		
		
		A = Saisie.lire_int("entrez un nombre");
		B = Saisie.lire_int("entrez un nombre");
		C = Saisie.lire_int("entrez un nombre");
		res = Max3(A,B,C);
		
		System.out.println("la plus grande valeur entre ces 3 nombres est"+ res);
		
		
		
	}

public static int Max3(int  Abis, int  Bbis, int Cbis) {
    int PG, PGfinal;
    PGfinal = Max2(Abis,Max2(Bbis, Cbis));
    return PGfinal;
}
public  static int Max2(int V1,int V2) {
if  (V1 > V2)return V1;
else return V2;
}
}