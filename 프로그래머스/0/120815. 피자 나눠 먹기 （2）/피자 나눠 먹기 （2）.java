class Solution {
    public int solution(int n) {
        int answer = 0;
        int i = 0;
        while(i<=600){
            i++;
            if(i%6 == 0 && i % n == 0){
                answer = i/6;
                break;
            }
        }
        return answer;
    }
}