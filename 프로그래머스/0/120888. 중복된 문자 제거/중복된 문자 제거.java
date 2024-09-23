import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        List list = new ArrayList<>();
        
        char[] charArray = my_string.toCharArray();
        
        for(char c : charArray){
            if(!list.contains(c)){
                list.add(c);
                answer += c;
            }
        }
        
        
        return answer;
    }
}