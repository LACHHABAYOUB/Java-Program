public class Test{
	public static void main(String[] args){
	int n=11;
		if (isprime(n)) {
			System.out.println(n+" is Prime number ");
		}
		else {
			System.out.println(n+" is Not prime number");
		}
		
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
	
}
