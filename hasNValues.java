public class Test {

	 public static void main(String[] args) {
	        System.out.println(hasNValues(new int[]{1, 2, 2, 1}, 2));
	        System.out.println(hasNValues(new int[]{1, 1, 1, 8, 1, 1, 1, 3, 3}, 3));
	        System.out.println(hasNValues(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 10));
	        System.out.println(hasNValues(new int[]{1, 2, 2, 1}, 3));
	        System.out.println(hasNValues(new int[]{1, 1, 1, 8, 1, 1, 1, 3, 3}, 2));
	        System.out.println(hasNValues(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 20));
	    }


    static int hasNValues(int[] a, int n) {

    	if (a.length<=0 || a.length<n) {
    		return 0;
    	}
    	
    	int [] b =new int [n];
    	int total=0;
    	
    	for (int i=0;i<a.length;i++) {
    		boolean flag=false;
    		for (int j=0;j<b.length;j++) {
    			if (a[i]==b[j]) {
    				flag=true;
    				break;
    			}
    		}
    		if (!flag) {
    			if (total >=n) {
    				return 0;
    			}
    			b[total]=a[i];
    			total++;
    		}
    		
    		
    	}
    	
    	if (total ==n) {
    		return 1;
    	}
    	
        return 0;
    }
}
