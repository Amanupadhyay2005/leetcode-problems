import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public int maxProduct(int x) {
        ArrayList<Integer> list = new ArrayList<>();
        
        while(x!=0){
        int lastdigit = x%10;
        list.add(lastdigit);
            x = x/10;    
        }

      Collections.sort(list);
      int n =  list.get(list.size()-1) * list.get(list.size()-2);
      return n;
  }
}