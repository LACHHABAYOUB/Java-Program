public class Test {

    public static void main(String[] args) {
        System.out.println(isTwinPrime(5));
        System.out.println(isTwinPrime(7));
        System.out.println(isTwinPrime(53));
        System.out.println(isTwinPrime(9));



    }

    static int isTwinPrime(int n) {
    	int res=0;
    	for (int i=2 ;i<=Math.sqrt(n);i++) {
    			if (n%i==0) {
    				res=0;
    				continue;
    			}
    			else {
    				if((n+2)%i==0 || (n-2)%i==0) {
    					res=0;
    					break;
    				}
    				else {
    					res=1;
    				}
    			}
    	}
		return res;
	    }
	}