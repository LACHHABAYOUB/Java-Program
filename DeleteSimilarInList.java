import java.util.ArrayList;
import java.util.Collection;
import java.util.*;
class Test { 
	
	
	static void editlist (Collection<String> l1, Collection<String>  l2) {
		Iterator<String> it =l1.iterator();
		while (it.hasNext()) {
			if (l2.contains(it.next())) {
				it.remove();
			}
		}
	}


    public static void main(String[] args)  { 
	
    	String [] S= {"lachhab" ,"ayoub","egg","pats"};
    	List<String> list1 = new ArrayList<String> ();
    	
    	for (String i:S) {
    		list1.add(i);
    	}
    	
     	String [] A= {"lachhab" ,"ayoub"};
    	List<String> list2 = new ArrayList<String> ();
    	
    	for (String i:A) {
    		list2.add(i);
    	}
    	
    	editlist(list1,list2); // call of method 
   
    	for (int j=0;j<list1.size();j++) {
    	System.out.println(list1.get(j));
    	}
    	
    	
    	
    	
    	
    	
    }
}