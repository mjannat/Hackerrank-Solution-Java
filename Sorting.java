
package hackerrank;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        
    ArrayList<Integer>list = new ArrayList<>();
   list.add(10);
   list.add(24);
   list.add(-10);
   list.add(20);
  Collections.sort(list);
    for(int temp : list)
    {
        System.out.println(temp);
    }
}
}
