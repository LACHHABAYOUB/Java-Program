
public class Test{
	public static void main(String[] args){
		boolean result=isFibonacci(3);
		System.out.println(result);
		result=isFibonacci(8);
		System.out.println(result);
		result=isFibonacci(12);
		System.out.println(result);
	}
	
	  static  boolean isPerfectSquare(int x) {
	        int s = (int) Math.sqrt(x);
	        return (s*s == x);
	    }

	     static boolean isFibonacci(int n) {
	      return isPerfectSquare(5*n*n + 4) || isPerfectSquare(5*n*n - 4);
	    }


	/*static int isFibonacci(int n) {
	    	  int firstTerm = 0;
	          
	          int secondTerm = 1;
	           
	          int thirdTerm = 0;
	           
	          while (thirdTerm < n)
	          {
	              thirdTerm = firstTerm + secondTerm;
	               
	              firstTerm = secondTerm;
	               
	              secondTerm = thirdTerm;
	          }
	          if(thirdTerm == n)
	          {
	        	  	return 1;
	          }
	     return 0;  
	     }*/

}





 
