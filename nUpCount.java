public class Test{
	public static void main(String[] args){
		int result = nUpCount(new int[]{2, 3, 1, -6, 8, -3, -1, 2}, 5);
		System.out.println("first: "+result);
		result = nUpCount(new int[]{6, 3, 1}, 6);
		System.out.println("Second :"+result);
		result = nUpCount(new int[]{1, 2, -1, 5, 3, 2, -3}, 20);
		System.out.println("Third :"+result);
	}

	 static int nUpCount(int[] a, int n){
		int nUpCount = 0;
		int previous = 0;
		int next = 0;
		for(int i=0; i<a.length; i++){
			previous = next;
			next += a[i];
			if(previous <= n && next > n){
				nUpCount++;
			}
		}
		return nUpCount;
	}
}