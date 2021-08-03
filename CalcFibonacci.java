
public class Test{
	public static void main(String[] args){
		int result=CalcFibonacci(2);
		System.out.println(result);
		result=CalcFibonacci(3);
		System.out.println(result);
		result=CalcFibonacci(4);
		System.out.println(result);
	}
	
	 static int CalcFibonacci(int n) {
	        int CalcFibonacci = 1;
	        if(n==2) {
	        	CalcFibonacci=2;
	        }
	        for (int i = 3; i <= n; i++) {
	        	CalcFibonacci = i-2+i-1; 
	        }
	        return CalcFibonacci;
	    }
}





 
