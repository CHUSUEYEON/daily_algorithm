import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        
        TreeSet<Integer> set = new TreeSet<>();
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                set.add(numbers[i] + numbers[j]);        
            }
        }
        int[] answer = new int[set.size()];
        for(int i = 0; i < answer.length; i++){
            answer[i] = set.pollFirst();
        }
        
        return answer;
    }
}