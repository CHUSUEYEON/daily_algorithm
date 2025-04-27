import java.util.*;

class Solution {
    boolean solution(String s) {
        
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        
        for(char c : arr){
            if(c == '(') stack.add(c);
            else {
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }
        
        if(!stack.isEmpty()) return false;

        return true;
    }
}