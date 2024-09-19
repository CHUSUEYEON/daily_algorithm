import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        answer = my_string.toLowerCase();
        char[] charArray = answer.toCharArray();
        Arrays.sort(charArray);
        answer = "";
        
        for(char c : charArray){
            answer += c;
        }
        return answer;
    }
}