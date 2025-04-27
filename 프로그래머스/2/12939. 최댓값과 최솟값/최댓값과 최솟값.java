import java.util.*;

class Solution {
    public String solution(String s) {
        int min, max, n;
        String[] str = s.split(" ");
        
        min = max = Integer.parseInt(str[0]);
        
        for(String st : str){
            n = Integer.parseInt(st);
            if(min > n) min = n;
            if(max < n) max = n;
        }
        
        return min + " " + max;
    }
}