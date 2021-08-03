public class Test {
	public static void main(String[] args) {
        System.out.println(guthrieIndex(1));
        System.out.println(guthrieIndex(2));
        System.out.println(guthrieIndex(3));
        System.out.println(guthrieIndex(4));
        System.out.println(guthrieIndex(42));
        System.out.println(guthrieIndex(7));
    

     
    }

	static int guthrieIndex(int n) {

		 int count = 0;

	        while (n > 1) {
	            if (n % 2 == 0)
	                n = n / 2;
	            else 
	              n = ((n * 3) + 1);
	            count++;
	        }

	        return count;
    }
}