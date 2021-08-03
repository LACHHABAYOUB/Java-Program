public class Test{
	public static void main(String[] args){
	    char[] result = a3 (new char [] {'a','b','c'},0,3);// You should change the exemple 
		     System.out.println(result); 	// attention {‘a’, ‘b’, ‘c’}, 0, 4	 give you error because he return null 
	}
	
	static char[] a3(char[] a, int start, int length){

		 if (length < 0 || start < 0 || start+length-1>=a.length)
		 {
		 return null;
		 }

		 char[] sub = new char[length];
		 for (int i=start, j=0; j<length; i++, j++)
		 {
		 sub[j] = a[i];
		 }
		 
		 return sub;
		}
}


 
