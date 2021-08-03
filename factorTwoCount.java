public class Test {
	  public static void main(String[] args) {
	        System.out.println(factorTwoCount(48));
	        System.out.println(factorTwoCount(27));
	    }

	static int factorTwoCount(int n) {
		int res=0;
			while (n%2==0) {
				res++;
				n/=2;
			}
	        return res;
	    }
	}