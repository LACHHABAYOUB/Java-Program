public class Test{
	public static void main(String[] args){
	
		int result =a6(new int [] {1, 8, 3, 7, 10, 2});
		System.out.println(result);
		result =a6(new int [] {1, 5, 3, 1, 1, 1, 1, 1, 1});
		System.out.println(result);
		result =a6(new int [] {2, 1, 1, 1, 2, 1, 7}	);
		System.out.println(result);
		result =a6(new int [] {1, 2, 3}	);
		System.out.println(result);
		result =a6(new int [] {3, 4, 5, 10}	);
		System.out.println(result);
		result =a6(new int [] {1, 2, 10, 3, 4});
		System.out.println(result);
	
		
	}
	
	static int a6(int[] a){
		if (a.length < 3) return -1;
		 	int i = 0;
		 	int j = a.length - 1;
		 	int idx = 1;
		 	int leftSum = a[i];
		 	int rightSum = a[j];
		 for (int k = 1; k < a.length - 2; k++)
		 	{
			 if (leftSum < rightSum)
			 	{
				 i++;
				 leftSum += a[i];
				 idx = i + 1;
			 	}
			 else
			 	{
				 j--;
				 rightSum += a[j];
				 idx = j - 1;
			 	}
		 	}
		 if (leftSum == rightSum)
		 return idx;
		 else
		 return -1;
	}
}
 
