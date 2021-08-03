import java.util.Arrays;

public class Test{
	public static void main(String[] args){
		//Test
		reverse(new int [] {1,2,3});
		    
	}
	
	static void reverse(int [] a) {
		
		 for(int i = 0; i < a.length / 2; i++)
		  {
		    int temp = a[i];
		    a[i] = a[a.length - i - 1];
		    a[a.length - i - 1] = temp;
		  }
		    System.out.println("Reverse array : "+Arrays.toString(a));
		
	}
}

 
