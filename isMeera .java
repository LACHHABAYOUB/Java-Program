public class Test {
	public static void main(String[] args) {
	
		System.out.println(isMeera(new int [] {-4,0,1,0,2}));
		System.out.println(isMeera(new int [] {-1,0,0,8,0}));
		System.out.println(isMeera(new int[]{3, 5, -2}));
	}
	
	static int isMeera (int [] a) {
		for (int i=0 ;i<a.length;i++) {
			if (i<a[i]) {
				return 0;
			}
		}
		return 1;
	}
}

