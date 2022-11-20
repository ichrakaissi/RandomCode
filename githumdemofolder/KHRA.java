public class Test{
	public static void main (String[] args){
		Ident a=new Ident();
		
		System.out.print(a.getIdent());
		System.out.print(Ident.getIdentMax());
		Ident b=new Ident();
		System.out.print(b.getIdent());
		System.out.print(Ident.getIdentMax());
	}
	
}