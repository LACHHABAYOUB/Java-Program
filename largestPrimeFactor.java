public class Test {
	public static void main(String[] args) {
        System.out.println(largestPrimeFactor(10));
        System.out.println(largestPrimeFactor(6936));
        System.out.println(largestPrimeFactor(1));

	}

	static	int largestPrimeFactor(int n) {
		 int maxPrime = 0; 

		 
	        while (n % 2 == 0) { 
	            maxPrime = 2; 
	  
	           n/=2;
	        } 
	  
	       
	        for (int i = 3; i <= Math.sqrt(n); i += 2) { 
	            while (n % i == 0) { 
	                maxPrime = i; 
	                n = n / i; 
	            } 
	        } 
	  
	    
	        if (n > 2) 
	            maxPrime = n; 
	  
	        return maxPrime; 
		
		
	}

}