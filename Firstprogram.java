import java.util.ArrayList;
import java.util.List;

class Test { 

    public static void main(String[] args)  { 
	
    	String [] S= {"lachhab" ,"ayoub"};
    	List<String> list = new ArrayList<String> ();
    	
    	for (String i:S) {
    		list.add(i);
    	}
    	
    	for (int j=0;j<list.size();j++) {
    	System.out.println(list.get(j));
    	}
    }
}