public class Test{
	public static void main(String[] args){
		//Test
		int result =power (2,2);
		    System.out.println(result);
		    
	}
	
	
	static int power (int base,int exponent) {
		int result = 1;

        while(exponent > 0) {
          result = result * base;
          exponent--;
        }
		
		return result;
		
	}
}
