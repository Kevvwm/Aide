package mon_package;

public class Prog13 {

	public static void main(String[] args) {
		int x,y,z,nb;
		
		System.out.println("Quels sont les 3 nombres saisi par ordre croissant");
		x = Saisie.lire_int("Le 1er nombre est : ");
		y = Saisie.lire_int("Le 2eme nombre est : ");
		z = Saisie.lire_int("Le 3eme nombre est : ");
		
		System.out.println("Veuillez saisir un nombre quelconque");		
		nb = Saisie.lire_int("Le nombre quelconque est : ");
		
		if(nb<x) {
			System.out.println("Les 3 plus petits nombres sont :"+ nb + ","+ x + "," + y );	
		} else if(nb<y) {
			System.out.println("Les 3 plus petits nombres sont :"+ x + ","+ nb + "," + y );		
		} else if(nb<z) {
			System.out.println("Les 3 plus petits nombres sont :"+ x + ","+ y + "," + nb );		
		}else {
			System.out.println("Les 3 plus petits nombres sont :"+ x + ", "+ y + ", " + z );	
		}
	}
}
