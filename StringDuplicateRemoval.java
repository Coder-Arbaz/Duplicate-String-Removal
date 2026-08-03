import java.util.*;

public class StringDuplicateRemoval {
  public static void main(String[] args) {
   // HashSet<String> cars = new HashSet<String>();
	  
	ArrayList<String> ar = new ArrayList<String>();
    ar.add("Volvo");
    ar.add("BMW");
    ar.add("Ford");
    ar.add("BMW");
    ar.add("BMW");
    ar.add("Mazda");
    ar.add("Volvo");
    ar.add("BMW");
    ar.add("Bugati");
    ar.add("BMW");
    ar.add("Mazda");
    System.out.println(ar);
    HashSet<String> cars = new HashSet<String>();
    int arl =ar.size()-1;
    while(arl >= 0)
    {
    	cars.add(ar.get(arl));
    	arl--;
    }
    System.out.println(cars);
  }
}
