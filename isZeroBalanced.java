public class Test {

    public static void main(String[] args) {

        System.out.println(isZeroBalanced(new int[]{1, 2, -2, -1}));
        System.out.println(isZeroBalanced(new int[]{-3, 1, 2, -2, -1, 3}));
        System.out.println(isZeroBalanced(new int[]{3, 4, -2, -3, -2}));
        System.out.println(isZeroBalanced(new int[]{0, 0, 0, 0, 0, 0}));
        System.out.println(isZeroBalanced(new int[]{-3, -3, -3}));
        System.out.println(isZeroBalanced(new int[]{3}));
        System.out.println(isZeroBalanced(new int[]{}));
    }

    static int isZeroBalanced(int[] a) {
		int sum=0;
		int counter=0;
		int res=0;
		int reallength=0;
		

			for (int i=0 ;i<a.length;i++) {
				sum+=a[i];
			}
			
			if (sum==0) {
				for (int j=0 ;j<a.length;j++) {
					for(int k=0 ;k<a.length;k++) {
						if(a[j]==-a[k] && j!=k) {
							counter++;
						}
						
						if (a.length%2==0) {
							reallength=a.length;
						}
						else {
							reallength=a.length+1;}
						
						
						if(counter==reallength) {
							res=1;
						}
					}
				}
			}
		
		return res;
	    }
	}