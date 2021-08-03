public class Test{
	public static void main(String[] args){
		int result = IsPerfectSquare(6);
		System.out.println(result);
		result = IsPerfectSquare(36);
		System.out.println(result);
		result = IsPerfectSquare(0);
		System.out.println(result);
		result = IsPerfectSquare(-5);
		System.out.println(result);
	}

	static int IsPerfectSquare(int n){
		int IsPerfectSquare = 0;
		if(n >= 0){
			double sqrtResult = Math.sqrt(n);
			int nextNumber = (int)Math.floor(sqrtResult) + 1;
			IsPerfectSquare = (int)Math.pow(nextNumber, 2);
		}
		return IsPerfectSquare;
	}
}