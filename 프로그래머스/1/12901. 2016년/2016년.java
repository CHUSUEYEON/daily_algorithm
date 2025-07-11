import java.util.*;

class Solution {
    public String solution(int a, int b) {
        String answer = "";
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 31);
        map.put(2, 29);
        map.put(3, 31);
        map.put(4, 30);
        map.put(5, 31);
        map.put(6, 30);
        map.put(7, 31);
        map.put(8, 31);
        map.put(9, 30);
        map.put(10, 31);
        map.put(11, 30);
        map.put(12, 31);
        int sum = 0;
        for(int m = 1; m < a; m++){
            sum += map.get(m);
        }
        sum += b; // 총 일 수 구하기
        sum %= 7;
        
        switch(sum){
            case 1 :
                answer = "FRI";
                break;
            case 2 :
                answer = "SAT";
                break;
            case 3 :
                answer = "SUN";
                break;
            case 4 : 
                answer = "MON";
                break;
            case 5 :
                answer = "TUE";
                break;
            case 6 :
                answer = "WED";
                break;
            case 0 :
                answer = "THU";
                break;
        }
        System.out.println(sum);

        return answer;
    }
}
// 2월 29까지 366일
// 4, 6, 9, 11 : 30일 
// 1(금) 2(토) 3(일) 4(월) 5(화) 6(수) 7(목)