

public class Test {

	 public static void main(String[] args) {

		 System.out.println(equivalentArrays(new int[]{0, 1, 2},new int[]{2, 0, 1}));
		 System.out.println(equivalentArrays(new int[]{0, 1, 2, 1},new int[]{2, 0, 1}));
		 System.out.println(equivalentArrays(new int[]{2, 0, 1},new int[]{0, 1, 2, 1}));
		 System.out.println(equivalentArrays(new int[]{5, 2, 0, 1},new int[]{0, 5, 5, 5, 1, 2, 1}));
		 System.out.println(equivalentArrays(new int[]{0, 2, 1, 2},new int[]{3, 1, 2, 0}));
		 System.out.println(equivalentArrays(new int[]{3, 1, 2, 0},new int[]{0, 2, 1, 0}));
		 System.out.println(equivalentArrays(new int[]{0, 1, 2},new int[]{2, 0, 1}));
		 System.out.println(equivalentArrays(new int[]{1, 1, 1, 1, 1, 1},new int[]{1, 1, 1, 1, 1, 2}));
		 System.out.println(equivalentArrays(new int[]{},new int[]{3, 1, 1, 1, 1, 2}));
		 System.out.println(equivalentArrays(new int[]{},new int[]{}));


    }
    static int equivalentArrays (int[] a1, int[] a2)    {
	
    	for(int i = 0; i < a1.length; i++){
			boolean check = false;
			for(int j = 0; j < a2.length; j++){
				if(a1[i] == a2[j]){
					check = true;
					break;
					}
			}
			
			if(!check) return 0;
		}
    	
		for(int i = 0; i < a2.length; i++){
			boolean check = false;
			for(int j = 0; j < a1.length; j++){
				if(a2[i] == a1[j]){
					check = true;
					break;
				}
			}
			
			if(!check) return 0;
		}
		
		return 1;

    }
}


/* Write a function named equivalentArrays that has two array arguments and returns 1
 if the two arrays contain the same values (but not necessarily in the same order), otherwise it returns 0. 
Your solution must not sort either array or a copy of either array! 
Also you must not modify either array, i.e.,
 the values in the arrays upon return from the function must be the same as when the function was called. 
Note that the arrays do not have to have the same number of elements, they just have to have one of more copies of the same values.*/


