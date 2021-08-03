public class Test {
	  public static void main(String[] args) {
	        System.out.println(sumDigits(3114));
	        System.out.println(sumDigits(-6543));
	    }

	    static int sumDigits(int n) {
	        if (n < 0)
	            n = -n;

	        int sum = 0;

	        while (n > 0) {
	            int rem = n % 10;
	            sum += rem;
	            n = n / 10;
	        }

	        return sum;
	    }
	}