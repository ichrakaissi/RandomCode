 class utilTab{
	static double somme (double[] t){
		double sum =0;
		for (int i=0;i<t.length ;i++ ){
			sum = sum + t[i];
	
			
		}
		return sum;
	}
	static void incre (double[] t,double val){
		for (int i=0;i<t.length ;i++ ){
			t[i]=t[i]+val;
			
		}
		
		
	}
	static double[] genere ( int n) {
		double[] T;
		for (int i=0;i<n+1 ;i++ ){
			if (i%2 == 0){
				T.add (i);
			}	
			
		return T;
	}
	public static void main (String args[]){
		double t1[] = {1.25, 2.5, 3.5, 5.} ;
		System.out.print ("t1 initial = ") ; 
		System.out.println (" somme = " +utilTab.somme(t1)) ;
		utilTab.incre (t1, 1.25) ;
		System.out.print ("t1 incremente = ") ;
		System.out.println (" somme = " +utilTab.somme(t1)) ;
		System.out.println( genere (5));
		
		
		
	}
	
}
