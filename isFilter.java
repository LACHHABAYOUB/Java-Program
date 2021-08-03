public class Test {

	  public static void main(String[] args) {
	        System.out.println(isFilter(new int[]{1, 2, 3, 9, 6, 11}));
	        System.out.println(isFilter(new int[]{3, 4, 6, 7, 14, 16}));
	        System.out.println(isFilter(new int[]{1, 2, 3, 4, 10, 11, 13}));
	        System.out.println(isFilter(new int[]{3, 6, 5, 5, 13 ,6, 13}));
	        System.out.println(isFilter(new int[]{9, 6, 18}));
	        System.out.println(isFilter(new int[]{4, 7, 13}));
	      
	    }

	  static int isFilter(int [] a)
      {
          int result = 1;
          for(int i=0;i<a.length;i++)
          {
              if(a[i]==9)
              {
                  for(int j=0;j<a.length;j++)
                  {
                      if(a[j]==11)
                      {
                          result = 1;
                          break;
                      }
                      else
                      {
                          result = 0;
                      }
                  }
              }
              if(a[i]==7)
              {
                  for(int j=0;j<a.length;j++)
                  {
                      if(a[j]==13)
                      {
                          result = 0;
                          break;
                      }
                  }
              }
          }
          return result;

      }
}
