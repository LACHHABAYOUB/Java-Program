public class Test{
	public static void main(String[] args){
		int result=isFibonacci(12);
		System.out.println(result);
		result=isFibonacci(13);
		System.out.println(result);
		result=isFibonacci(6);
		System.out.println(result);
	}
	
	
	static boolean perfectsquare(int n) {
		int x=(int )Math.sqrt(n);
		return (x*x==n);		
	}
	
	 static int isFibonacci (int n) {      
		 if (perfectsquare(5*n*n+ 4) || perfectsquare(5*n*n -4)) {
			 return 1;
		 }
	        return 0;
	    }
}





 
