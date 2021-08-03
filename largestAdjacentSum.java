public class Test {
	public static void main(String[] args) {
        System.out.println(largestAdjacentSum(new int []{1,2,3,4}));
        System.out.println(largestAdjacentSum(new int []{18,-12,9,-10}));
        System.out.println(largestAdjacentSum(new int []{1,1,1,1,1,1,1,1,1}));
        System.out.println(largestAdjacentSum(new int []{1,1,1,1,1,2,1,1,1}));

    }

	static int largestAdjacentSum(int[]a) {
		
		int sum=0;
		int com=sum;
		
		for (int i=0;i<a.length-1;i++) {
			sum=a[i]+a[i+1];
			if (sum>com)
				com=sum;
		}
		
		return com;
    }
}