public class Test{
	public static void main(String[] args){
		//Test
		minmaxarr (new int [] {2,3,1});
		minmaxarr (new int [] {2,5,3,0,1});
		minmaxarr (new int [] {-2,5,3,0,1});
		minmaxarr (new int [] {-2,-5,-3,0,-1});

	}
	
	
	
	static void minmaxarr (int []a) {
		
		int min=a[0];
		int max=a[0];
		
		for(int i=0;i<a.length ;i++) {
			if(a[i]<min) {
				min =a[i];
			}
			else if(a[i]>max) {
				max=a[i];
			}
		}
		
		System.out.println("Min is : "+min);
		System.out.println("Max is : "+max);

		
	}
}

 
