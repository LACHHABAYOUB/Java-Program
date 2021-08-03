public class Test{
	public static void main(String[] args){
	
		int i = 1;
		System.out.println("First i : "+i);
		int x = i++; //x is 1, i is 2
		System.out.println("X :"+x);
		System.out.println("Second i: "+i);
		int y = ++i; //y is 3, i is 3	
		System.out.println("Y:"+y);
		System.out.println("Third i:"+i);
	}
	
}
