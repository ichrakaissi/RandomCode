public class KHTEK {
	
	
	public int mediane (int o, int b){
			int x;
			x= (o+b)/2;
			return x;
	}
	 
	public static void printer (int e){
		System.out.println(e);
	}
	public static void main(String args[]){
		long start ,end ,elapsed;
		//calculate time elapsed 
		int f =0;
		start=System.currentTimeMillis();	//calculate time elapsed 
		int i= 1000;
		for ( i=0; i< 100000;i++){
			f++;
			
		}

		KHTEK hadi = new KHTEK() ;
		System.out.println (hadi.mediane(4,10));
		String a = new String("Hello");
		String b=new String ("Hello");
		end=System.currentTimeMillis();	//calculate time elapsed 
		elapsed =end -start;	//calculate time elapsed 
		System.out.println( a.equals (b));
		System.out.println ( a==b);
		printer (7);
	
		double[] T = new double[5] ;
		
		System.out.println(T);
	}
}
