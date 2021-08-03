public class Test{
	public static void main(String[] args){
		int result = a4(1234);
		     System.out.println(result); 	
		     result = a4(12005);
		     System.out.println(result); 	
		     result = a4(1);
		     System.out.println(result); 	
		     result = a4(1000);
		     System.out.println(result); 	
		     result = a4(0);
		     System.out.println(result); 	
		     result = a4(-12345);
		     System.out.println(result); 	
	}
	
	static int a4(int n)
	 {
	int sign = 1;
	if (n == 0) return 0;
	if (n < 0)
	{
	 sign = -1;
	 n = -n;
	}
	int reverse = 0;
	while (n != 0)
	{
	 reverse = (reverse * 10) + (n % 10);
	 n /= 10;
	}
	return sign * reverse;
	 }
}


 
