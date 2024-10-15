import java.util.*;
class Solution {
    public int solution(int[] array) {
        int answer = -1;
        int maxFrequency = 0;
        boolean duplicate = false;
        
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for(int num : array){
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        for(Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()){
            int num = entry.getKey();
            int frequency = entry.getValue();
            
            if(frequency > maxFrequency){
                maxFrequency = frequency;
                answer = num;
                duplicate = false;
            }else if(frequency == maxFrequency){
                duplicate = true;
            }
        }
        
        if(duplicate){
            return -1;
        }
        
        return answer;
    }
}