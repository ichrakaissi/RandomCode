import java.util.*;
class Ident{
	public Ident(){
		
		numobj= nummax;
		nummax++;
	}
	public int getIdent(){
		return numobj;
	}
	public static int getIdentMax(){
		return nummax;//wa pas besoin de this hadakchi li katdiri fih nti sponatanement this dirih blach 
	}
	//Scanner sc=new Scanner (System.in);
	//System.out.print("Enter something bitch");
	//String str= sc.nextLine();
	//System.out.print(str);
	private int numobj;
	//impossibility basically here to make use of the user's input and put it inside of the static variable nummax which is what we want to do
	//how to fix this?
	private static int nummax;
	static{
		System.out.println("donner le fuckin numero");
		Scanner sc= new Scanner (System.in);
		int str =sc.nextInt();
		nummax= str;
	}


}
//1.Quels sont les champs li kaynine ?
//2.Comment/si on doit les initiliser ?
//3.Comment l'appel du constructeur devra-t-il etre,qu'est-ce qu'il devra faire?
//4.Que doit retourner chaque methode?