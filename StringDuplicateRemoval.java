import java.util.*;

public class StringDuplicateRemoval {
  public static void main(String[] args) {
	  
	ArrayList<String> ar = new ArrayList<String>(); //Or ArrayList<String> ar = new ArrayList<>();
    ar.add("Volvo");
    ar.add("BMW");
    ar.add("Ford");
    ar.add("BMW");
    ar.add("Thar");
    ar.add("Mazda");
    ar.add("Volvo");
    ar.add("Thar");
    ar.add("Bugati");
    ar.add("BMW");
    ar.add("Mazda");
    System.out.println(ar);
    LinkedHashSet<String> cars = new LinkedHashSet<String>(); //Or LinkedHashSet<String> cars = new LinkedHashSet<>();
    int arl =ar.size()-1;
    while(arl >= 0)
    {
    	cars.add(ar.get((ar.size()-1)-arl));
    	arl--;
    }
    System.out.println(cars);
  }
}
