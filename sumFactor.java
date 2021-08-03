public class Test {
	public static void main(String[] args) {
        System.out.println(sumFactor(new int[] {3, 0, 2, -5, 0}));
        System.out.println(sumFactor(new int[] {9,-3,-3, -1, -1}));
        System.out.println(sumFactor(new int[] {1}));
        System.out.println(sumFactor(new int[] {0, 0, 0}));
        System.out.println(sumFactor(new int[] {1, -1, 1, -1, 1, -1, 1}));
        System.out.println(sumFactor(new int[] {1, 2, 3, 4}));

     
    }

	static int sumFactor(int[ ] a) {

		int total=0;
		int n=0;
		for (int i=0; i<a.length ;i++) {
			total+=a[i];
		}
		for (int j=0;j<a.length;j++) {
			if (a[j]==total) {
				n++;
			}
		}
	
        return n;
    }
}