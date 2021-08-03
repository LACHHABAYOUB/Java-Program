public class Test{
	public static void main(String[] args){
	    int  result = a(new int [] {1,2,3,4,5});
		     System.out.println(result);
		     result = a(new int [] {3,2,1,4,5});
			 System.out.println(result);
			 result = a(new int [] {3,2,1,4,1});
			 System.out.println(result);
			 result = a(new int [] {1,2,3,4});
			 System.out.println(result);
			 result = a(new int [] {});
			 System.out.println(result);
			 result = a(new int [] {10});
			 System.out.println(result);

	}
	 static int a(int[] a)
	 {
	 if (a == null || a.length % 2 == 0) return 0;
	int midIndex = a.length / 2 ;
	int middleItem = a[midIndex];
	for (int i=0; i<a.length; i++)
	 {
	 if (i != midIndex && middleItem >= a[i])
	 return 0;
	}
	return 1;
	 }
}
