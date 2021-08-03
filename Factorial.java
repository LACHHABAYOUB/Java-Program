class Test { 

	/*  static int fact(int a){ 
    	int fact=1;
    	for (int i=1;i<=a;i++) {
    		fact *=i;
    	}

    	return fact;
    
    } */
 
	
	 static int fact(int a){ 
		 if (a<=1)
			 return 1;
		 else 
			 return a*fact(a-1);
	 }
    public static void main(String[] args)  { 
	
		System.out.print(fact(5)); 
 
    }
    
    
}