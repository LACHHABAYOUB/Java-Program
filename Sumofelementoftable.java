public class Test{

	public static void main(String[] args){
	
		  int a[]={12,13,14,44};
		  int b[]= {11,10,15,20};
		  int c[]= new int[a.length];
		     System.out.println("----------------------FIRST TABLE--------------------------------");
		   for(int i:a){
		     System.out.println("Element : "+i);
		   }

		     System.out.println("----------------------SECOND TABLE -----------------------------");

		     for(int j:b){
			     System.out.println("Element : "+j);
			   }


		     System.out.println("-----------------------SUM OF TABLE------------------------------------");

		    if (a.length==b.length) {
		     for (int i=0,j=0,k=0 ;i<a.length;i++,j++,k++) {
		    	 c[k]=a[i]+b[j];
		     }}
		    else {
		    	System.out.println("Diff Length of Array ");
		    }
		     
		     System.out.println("-----------------------------------------------------------");
		     for(int x:c){
			     System.out.println("Element : "+x);
			   }
	}
	
}
 
