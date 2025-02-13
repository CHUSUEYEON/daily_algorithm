import java.util.*;
class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        
        String rev = "";
        String temp = "";
        for(int i = 0; i < arr.length; i++){
            if(i >= s && i <= e){
                rev += arr[i];
            }else if(i > e){
                temp += arr[i];
            }else{
            answer += arr[i];
            }
        }
        
        StringBuilder sb = new StringBuilder(rev).reverse();
        
        answer += sb;
        answer += temp;
        return answer;
    }
}