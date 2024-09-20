import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        ArrayList<Integer> newNumbers = new ArrayList<>();
        for(int i = 0; i < numbers.length -1; i++){
            for(int j = i+1; j < numbers.length; j++){
                int number = numbers[i] * numbers[j];
                newNumbers.add(number);
            }
        }
        Collections.sort(newNumbers);
        answer = newNumbers.get(newNumbers.size()-1);
        
        return answer;
    }
}