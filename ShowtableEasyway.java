public class Test{
	public static void main(String[] args){
	
		  int a[]={12,13,14,44};
		  int add=0;
		  int sum=0;
				  
		     System.out.println("----------------------FIRST--------------------------------");
		   for(int i:a){
			  add+=i;
		     System.out.println("Element : "+i);
		   }
		     System.out.println("Sum Of Element 1: "+add);

		     System.out.println("------------------------SECOND-----------------------------");

		   for (int j=0 ;j<a.length ;j++) {
			   sum+=a[j];
			     System.out.println("Element 2: "+a[j]);

		   }
		     System.out.println("Sum Of Element 2: "+sum);


		     System.out.println("-----------------------------------------------------------");

	}
	
}
 
