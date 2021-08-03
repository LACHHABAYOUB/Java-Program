public class Test{
	public static void main(String[] args){
	
		int result =hasSingleMaximum(new int [] {1, 2, 3, 1, 0});
		System.out.println(result);
		result =hasSingleMaximum(new int [] {18});
		System.out.println(result);
		result =hasSingleMaximum(new int [] {1, 2, 3, 0, 1, 3}	);
		System.out.println(result);
		result =hasSingleMaximum(new int [] {13, 1, 13, 2, 13, 0, 13, 1, 13});
		System.out.println(result);
		result =hasSingleMaximum(new int [] {}	);
		System.out.println(result);
		result =hasSingleMaximum(new int [] {-6 -6 -6, -6, -6, -6 -6});
		System.out.println(result);
	
		
	}
	
	static int hasSingleMaximum(int[] a) {
	    	
	    	 int max=Integer.MIN_VALUE;
	    	 boolean flag=true;
	    	 
	    if (a.length<=0) {
	    	return 0;
	    }
	    
	    	 
	  for (int i=0; i<a.length;i++) {
	    	 if (a[i]== max) {
	    		 flag=false;
	    	 }
	    	 
	    	 else if (a[i]>max) {
	    		 max=a[i];
	    		 flag=true;
	    	 }
	    	 
	  }
	    	    return flag ? 1:0;	
	 
	    	 
	    }
}