public class Test{
	public static void main(String[] args){
		//Test
		int result =character("test",'t');
		  System.out.println(result);
		    
	}
	
	static int character(String a,char c) {
		int res=0;
		for (int i=0;i<a.length();i++) {
		      if (a.charAt(i) == c) 
		    	  res++;
		}
      
		return res;
		
	}
}

 
