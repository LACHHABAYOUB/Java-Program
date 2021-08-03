public class Test {
	public static void main(String[] args) {
        System.out.println(isRapidlyIncreasing(new int[] {1, 3, 9, 27}));
        System.out.println(isRapidlyIncreasing(new int[] {1, 3, 200, 500}));
        System.out.println(isRapidlyIncreasing(new int[] {1}));
        System.out.println(isRapidlyIncreasing(new int[] {1, 3, 9, 26}));
        System.out.println(isRapidlyIncreasing(new int[] {1, 3, 7, 26}));
        System.out.println(isRapidlyIncreasing(new int[] {1, 3, 8, 26}));

     
    }

	static int isRapidlyIncreasing(int[ ] a) {

		int sum=0;
		
		if (a==null || a.length<=0) {
			return 0;
		}
		if (a.length==1) {
			return 1;
		}
		
		for (int i=0; i<a.length-1;i++) {
			sum+=a[i];
			if (a[i+1]<=2*sum) {
				return 0;
			}
			
		}
        return 1;
    }
}