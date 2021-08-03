public class Test {

	 public static void main(String[] args) {
	        System.out.println(isComplete(new int[]{3, 2, 9, 5}));
	        System.out.println(isComplete(new int[]{36, -28}));
	        System.out.println(isComplete(new int[]{36, 28}));
	        System.out.println(isComplete(new int[]{4}));
	        System.out.println(isComplete(new int[]{3, 2, 1, 1, 5, 6}));
	        System.out.println(isComplete(new int[]{3, 7, 23, 13, 107, -99, 97, 81}));
	    }
	 
	 static boolean IsSquare(int n) {
	    	int sq=(int)Math.sqrt(n);
	    	return sq*sq==n;
		}

	    static int isComplete(int[] a) {
    	boolean checkeven=false;
    	boolean checsquare=false;
    	boolean sum=false;

    	for (int i=0 ;i<a.length;i++) {
    		if (a[i]%2==0) {
    			checkeven=true;
    		}
    		
    		if(IsSquare(a[i]) && a[i]!=1) {
    			checsquare=true;
    		}
    		
    		for (int j=0;j<a.length;j++) {
    			if (a[i]+a[j]==8 && i!=j)
    				sum=true;
    		}
    	
    	}
	    
    	if (checkeven && checsquare && sum) {
    		return 1;
    	}   	
    	return 0;
	}
}