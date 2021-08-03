import java.util.Arrays;

public class Test{
	public static void main(String[] args){
		sumArrays(new int[]{0, 1, 2, 5},new int[]{2, 0, 1});
		
	}
	
	static void sumArrays(int[] a, int[] b) {
		int[] result = new int[Math.max(a.length, b.length)];
		   for (int i = 0; i < result.length; i++) {
		      if (i < a.length)
		         result[i] += a[i];
		      if (i < b.length)
		         result[i] += b[i];
		   }
		   System.out.println("sum array : "+Arrays.toString(result));
	}
}





 
