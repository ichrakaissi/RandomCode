import java.util.*;
class tryentree{
	public static void main(String[] args){
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter something bitch");
		String str= sc.nextLine();
		int n=2;
		System.out.println(n);
		yaani.increment(n);
		System.out.println(n);
		System.out.print(Math.sqrt(9));//Math.sqrt peut etre utilise directement 
		Vecteur3d v1 = new Vecteur3d (3, 2, 5) ;
		Vecteur3d v2 = new Vecteur3d (1, 2, 3) ;
		Vecteur3d v3 ;
		System.out.print ("v1 = " ) ; v1.affiche() ;
		System.out.print ("v2 = " ) ; v2.affiche() ;
		v3 = Vecteur3d.somme (v1, v2) ;
		System.out.print ("v1 + v2 = " ) ; v3.affiche() ;
		System.out.println ("v1.v2 = " + v1.scalaire(v2)) ; // ou
		v2.scalaire(v1);
		
	
	}
}