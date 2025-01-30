class Solution {
    public int[] solution(int[] num_list, int n) {
        
        int cnt = 0;
        for(int i = 0 ; i < num_list.length ; i += n){
            cnt++;
        }
        
        int[] answer = new int[cnt];
        int idx = 0;
        for(int i = 0 ; i < num_list.length ; i += n){
            answer[idx++] = num_list[i];
        }
        return answer;
    }
}