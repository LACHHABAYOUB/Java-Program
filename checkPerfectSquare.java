class Test { 

    static boolean checkPerfectSquare(double x){ 
	
	int s = (int) Math.sqrt(x);
        return (s*s == x);
    	/*double s= Math.sqrt(x); 	
    	return (s- Math.floor(s) == 0); */
    
    } 
 
    public static void main(String[] args)  { 
	
	double num =9; //test
	
	if (checkPerfectSquare(num)) 
		System.out.print(num+ " is a perfect square number"); 
	else
		System.out.print(num+ " is not a perfect square number"); 
    } 
}