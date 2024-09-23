import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 1 ; i < n + 1; i++){
            List list = new ArrayList<>();
            for(int j = 1 ; j <= i; j++){
                if(i % j == 0){
                    list.add(j);
                }
            }
            if(list.size() > 2){
                answer++;
            }
        }
        
        return answer;
    }
}