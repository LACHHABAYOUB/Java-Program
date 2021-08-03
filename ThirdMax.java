public class Test{
	public static void main(String[] args){
		//Test
		int result =secondmaxarr (new int [] {0,1,4,2,3,5});
		    System.out.println(result);
		    result =secondmaxarr (new int [] {2,5,6,3,0,1});
		    System.out.println(result);
		    result =secondmaxarr (new int [] {59,9,5,55,8,0,3,54});
		    System.out.println(result);
		    result =secondmaxarr (new int [] {59,1,57,52,50,15,2});
		    System.out.println(result);
		//  List list = Arrays.asList(new Integer[] {1, 2, 29, 4, 28, 6, 27, 8});
		//  Collections.sort(list);
		//  System.out.print(list.get(list.size()-3));
	}
	
	
	static int secondmaxarr (int []a) {
		
		int max=a[0];
		int maxsecond=a[0];
		int maxthird=a[0];

		for (int i=0 ;i<a.length ;i++) {
			if (max <a[i]) {
				maxthird=maxsecond;
				maxsecond=max;
				max=a[i];
			}
			
			else if (maxsecond<a[i]) {
				maxthird=maxsecond;
				maxsecond=a[i];
			}
			else if (maxthird<a[i]) {
				maxthird=a[i];
			}
		}
		
		return maxthird;
		
	}
}

 
