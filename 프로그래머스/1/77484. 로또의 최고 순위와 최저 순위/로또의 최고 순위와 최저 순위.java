import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 6);
        map.put(2, 5);
        map.put(3, 4);
        map.put(4, 3);
        map.put(5, 2);
        map.put(6, 1);
        map.put(0, 6);

        int count = 0;
        int cnt = 0;
        for(int l : lottos){
            if(l == 0) cnt++;
        }
        
        for(int w : win_nums){
            for(int i = 0; i < 6; i++){
                if(lottos[i] == w) count++;
            }
        }
        //System.out.println(set);

        int high = count + cnt;
        int low = count;
        int highScore = map.get(high);
        int lowScore = map.get(low);
        
        

        int[] answer = {highScore, lowScore};
        
        return answer;
    }
}

// 우선 for문으로 맞는 숫자가 있다면 set에 저장!
// set.size()로 최저는 바로 구함.
// set.size() + cnt : 최대 