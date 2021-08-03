public class Test {

    public static void main(String[] args) {
        System.out.println(isPrimeHappy(5));
        System.out.println(isPrimeHappy(25));
        System.out.println(isPrimeHappy(32));
        System.out.println(isPrimeHappy(8));
        System.out.println(isPrimeHappy(2));
    }
public static boolean isprime(int n) {
		
		boolean prime=true;
		 
		if (n<=1) {
			prime=false;
		}
		
		for (int i=2 ; i<=Math.sqrt(n);i++) {
			if (n%i==0) {
				prime=false ;
				break;
			}
		}
		return prime ;
	}

    static int isPrimeHappy(int n) {
        int sum = 0;
        for(int i=2; i<n; i++) {
            if(isprime(i)) sum+=i;
        }
        return sum!=0 && sum%n==0 ? 1 : 0;
    }

   
}