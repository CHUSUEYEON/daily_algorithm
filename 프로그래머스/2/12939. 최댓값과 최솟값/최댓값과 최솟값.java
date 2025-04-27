import java.util.*;

class Solution {
    public String solution(String s) {
        String[] str = s.split(" ");
        int[] arr = new int[str.length];
        
        int idx = 0;
        for(String st : str){
            arr[idx++] = Integer.parseInt(st);
        }
        
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]).append(" ").append(arr[arr.length-1]);
        
        
        return sb.toString();
    }
}