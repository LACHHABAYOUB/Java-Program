public class Test {
	 public static void main(String[] args) {
	        System.out.println(is121Array(new int[]{1, 2, 3, 3, 2, 1}));
	        System.out.println(is121Array(new int[]{0, 1, 2, 3, 1, 2, 3}));
	        System.out.println(is121Array(new int[]{1, 2, 3, 3, 2, 1, 1, 2, 3}));
	        System.out.println(is121Array(new int[]{1, 2, 3}));
	        System.out.println(is121Array(new int[]{1, 2, 3,1,2}));
	        System.out.println(is121Array(new int[]{}));
	    }

	    static int is123Array(int[] a) {
	    	
	    	if (a.length%3!=0 || a.length<=0) {
	    		return 0;
	    	}

	    	
	    	    for (int i = 0; i < a.length; i += 3) {
	    	        if (a[i] != 1 || a[i + 1] != 2 || a[i + 2] != 3) {
	    	            return 0;
	    	        }
	    	    }

	    	    return 1;	
	 
	    	 
	    }
}