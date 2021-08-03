import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {
    	System.out.println(isOlympic(new int[ ] {1, 2, 3}));
    	System.out.println(isOlympic(new int[ ] {2, 2, 1, 1}));
    	System.out.println(isOlympic(new int[ ] {1, 2, 1, 3, 2}));
    	System.out.println(isOlympic(new int[ ] {1, 2, -1, 2, 2} ));

    }

   static int isOlympic (int[ ] a) {
	   
	   List<Integer> array = new ArrayList<Integer>();
       for (int i : a) {
           array.add(i);
       }
       Collections.sort(array);
       int sum = 0;
       int index = 0;
       while (index < array.size() - 1) {
           if (array.get(index) < 0) {
               return 0;
           }
           sum += array.get(index++);
           if (array.get(index - 1) < array.get(index)) {
               if (sum > array.get(index)) {
                   return 0;
               }
           }
       }
       return 1;
   }
}