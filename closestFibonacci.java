public class Test{
	public static void main(String[] args){
		int result=closestFibonacci(12);
		System.out.println(result);
		result=closestFibonacci(33);
		System.out.println(result);
		result=closestFibonacci(34);
		System.out.println(result);
	}
	
	 static int closestFibonacci(int n) {
	        int x = 1;
	        int y = 1;
	        for (int i = 0; i <= n; i++) {
	             int CheckFibonacci = x + y; 
	            if (CheckFibonacci > n) 
				return y;
	            x = y;
	            y = CheckFibonacci;
	        }
	        return 0;
	    }
}





 
