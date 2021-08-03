import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
	
		System.out.println(isTwinPaired(new int [] {-6,12,1,24,3,5}));
		System.out.println(isTwinPaired(new int [] {-1,0,0,8,0}));
		System.out.println(isTwinPaired(new int[]{3, 5, -2}));
	}
	
	static int isTwinPaired(int[ ] a) {
		 int res = 0;
	        ArrayList<Integer> evenList = new ArrayList<Integer>();
	        ArrayList<Integer> oddList = new ArrayList<Integer>();

	        for(int i=0; i<a.length; i++) {
	            if(a[i] % 2 == 0) {
	                evenList.add(a[i]);
	            } else {
	                oddList.add(a[i]);
	            }
	        }

	        boolean isEvenSorted = true;
	        for (int i = 1; i < evenList.size(); i++) {
	            if (evenList.get(i-1).compareTo(evenList.get(i)) != -1) {
	            	isEvenSorted = false;
	            }
	        }

	        boolean isOddSorted = true;
	        for (int i = 1; i < oddList.size(); i++) {
	            if (oddList.get(i-1).compareTo(oddList.get(i)) != -1) {
	                isOddSorted = false;
	            }
	        }

	        if(isEvenSorted && isOddSorted) {
	            res = 1;
	        }

	        return res;
	}
}

