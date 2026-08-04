import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class

public class IntegerSortingWithArrayList {
  public static void main(String[] args) {
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(50);
    myNumbers.add(11);
    myNumbers.add(20);
    myNumbers.add(04);
    myNumbers.add(80);
    myNumbers.add(12);
    myNumbers.add(04);
    myNumbers.add(11);
    myNumbers.add(10);
    System.out.println(myNumbers);
    Collections.sort(myNumbers);  // Sort myNumbers

    for (int i : myNumbers) {
      System.out.println(i);
    }
  }
}

// Input: [50, 11, 20, 4, 80, 12, 4, 11, 10]
// Output:[4, 4, 10, 11, 11, 12, 20, 50, 80]