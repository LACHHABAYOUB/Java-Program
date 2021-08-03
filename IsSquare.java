public class Test {

    public static void main(String[] args) {
	        System.out.println(IsSquare(4));
	        System.out.println(IsSquare(25));
	        System.out.println(IsSquare(-4));
	        System.out.println(IsSquare(8));
	        System.out.println(IsSquare(0));

	      
	    }

    static int IsSquare(int n) {
    	int sq=(int)Math.sqrt(n);
    	if (sq*sq==n) {
    		return 1;
    	}
    
    	return 0;
	}
	
}