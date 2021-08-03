public class Test{
	public static void main(String[] args){
	    int  result = f(new int [] {1});
		     System.out.println(result);
		     result = f(new int [] {1,2});
			 System.out.println(result);
			 result = f(new int [] {1,2,3});
			 System.out.println(result);
			 result = f(new int [] {3,3,4,4});
			 System.out.println(result);
			 result = f(new int [] {3,2,3,4});
			 System.out.println(result);
			 result = f(new int [] {4,1,2,3});
			 System.out.println(result);
			 result = f(new int [] {1,1});
			 System.out.println(result);
			 result = f(new int [] {});
			 System.out.println(result);
	
	}
	static int f(int[ ] a) {
		int X=0; //X odd number
		int Y=0; //Y Even number 
		
		for (int i=0 ;i<a.length ;i++) {
			if (a[i]%2==0) {
				Y+=a[i];
			}
			else {
				X+=a[i];
			}
		}
		
		return X-Y;
	}
}
