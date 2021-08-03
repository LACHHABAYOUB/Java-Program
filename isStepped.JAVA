public class Test {

    public static void main(String[] args) {
        System.out.println(isStepped(new int[]{1, 1, 1, 5, 5, 5, 5, 8, 8, 8}));
        System.out.println(isStepped(new int[]{1, 1, 5, 5, 5, 5, 8, 8, 8}));
        System.out.println(isStepped(new int[]{5, 5, 5, 15}));
        System.out.println(isStepped(new int[]{3, 3, 3, 2, 2, 2, 5, 5, 5}));
        System.out.println(isStepped(new int[]{3, 3, 3, 2, 2, 2, 1, 1, 1}));
        System.out.println(isStepped(new int[]{1, 1, 1}));
        System.out.println(isStepped(new int[]{1, 1, 1, 1, 1, 1, 1}));
    }

    static int isStepped(int[ ] a) {

    	for (int i=0 ; i<a.length;){
    	int j=i;
		int count=0;
    		while (j<a.length){
    
    			if (a[i]==a[j]){
    			j++;
    			count++;
    			}
    			
    			else if (a[i]>a[j]){
    			return 0;
    			}
    			else {
    			break;
    			}        	
      		}
    		
    		if (count <3) {return 0;}
    		i=j;
    	}
    	
    	return 1;


    }


}