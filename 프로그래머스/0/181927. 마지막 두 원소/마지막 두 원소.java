class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        int lastNum = num_list.length - 1;
        System.out.println(num_list[lastNum]);
        
        if(num_list[lastNum] > num_list[lastNum-1]){
            for(int i = 0 ; i < num_list.length ; i++){
                answer[i] = num_list[i];
            }
            answer[num_list.length] = num_list[lastNum] - num_list[lastNum-1];
        }else{
            for(int i = 0 ; i < num_list.length ; i++){
                answer[i] = num_list[i];
            }
            answer[num_list.length] = num_list[lastNum] * 2;
        }
        return answer;
    }
}