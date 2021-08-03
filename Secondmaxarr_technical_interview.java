public class Test{
	public static void main(String[] args){
		//Test
		int result =secondmaxarr (new int [] {0,1,2});
		    System.out.println(result);
		    result =secondmaxarr (new int [] {2,5,6,3,0,1});
		    System.out.println(result);
		    result =secondmaxarr (new int [] {1,9,5,55,8,-1,3,54});
		    System.out.println(result);
	}
	
	
	static int secondmaxarr (int []a) {
		
		int secondmax=Integer.MIN_VALUE;
		int max=Integer.MIN_VALUE;

		
		for (int i=0;i<a.length;i++) {
			if (a[i]>max) {
				secondmax=max;
				max=a[i];
			}
			
			if (a[i]<max && a[i]>secondmax) {
				secondmax=a[i];
			}
			
		}
		
		return secondmax;
		
	}
}

 
