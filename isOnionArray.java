public class Test {

	public static void main(String[] args) {
        System.out.println(isOnionArray(new int[]{1, 2, 19, 4, 5}));
        System.out.println(isOnionArray(new int[]{1, 2, 3, 4, 15}));
        System.out.println(isOnionArray(new int[]{1, 3, 9, 8}));
        System.out.println(isOnionArray(new int[]{2}));
        System.out.println(isOnionArray(new int[]{}));
        System.out.println(isOnionArray(new int[]{-2, 5, 0, 5, 12}));
        
    }

    static int isOnionArray(int[] a) {
      
    	for (int i=0 ,j=a.length-1 ;i<j;i++,j--) {
    		if (i+j+1==a.length && i!=j) {
    			if (a[i]+a[j]>10) {
    				return 0;
    			}
    		}
    	}
    	
        return 1;
    	}

    }
