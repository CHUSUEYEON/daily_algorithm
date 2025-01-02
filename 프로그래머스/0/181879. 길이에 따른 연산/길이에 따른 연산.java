class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multi = 1;
        int sum = 0;
        for(int i : num_list){
            sum += i;
            multi *= i;
        }
        
        answer = (num_list.length < 11) ? multi : sum;
        return answer;
    }
}