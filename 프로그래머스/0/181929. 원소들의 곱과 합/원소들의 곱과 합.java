class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multi = 1;
        int sum = 0;
        for(int a : num_list){
            multi = multi * a;
            sum += a;
        }
        answer = (multi < sum * sum) ? 1 : 0; 
        return answer;
    }
}