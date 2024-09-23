import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i) - '0' < 10){                
            list.add(my_string.charAt(i)-'0');
            }
            
        }
        
        Collections.sort(list);
        int[] array = list.stream().mapToInt(Integer::intValue).toArray();

        return array;
    }
}