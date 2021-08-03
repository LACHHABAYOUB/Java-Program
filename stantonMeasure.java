public class Test {
	public static void main(String[] args) {
        System.out.println(stantonMeasure(new int[] {1}));
        System.out.println(stantonMeasure(new int[] {0}));
        System.out.println(stantonMeasure(new int[] {3, 1, 1, 4}));
        System.out.println(stantonMeasure(new int[] {1, 3, 1, 1, 3, 3, 2, 3, 3, 3, 4}));
        System.out.println(stantonMeasure(new int[] {}));
        System.out.println(stantonMeasure(new int[] {1, 4, 3, 2, 1, 2, 3, 2}));
      
     
    }

	static int stantonMeasure(int[ ] a) {

		int count=0;
		int n=0;
		for (int i=0; i<a.length ;i++) {
			if (a[i]==1) {
				count++;
			}
		}
		for (int j=0;j<a.length;j++) {
			if (a[j]==count) {
				n++;
			}
		}
	
        return n;
    }
}