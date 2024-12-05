import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        String[] arr = str.split("");
        
        for(int i = 0; i < arr.length ; i++){
            System.out.println(arr[i]);
            answer += Integer.valueOf(arr[i]);
        };

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        // System.out.println(arr.toString());

        return answer;
    }
}