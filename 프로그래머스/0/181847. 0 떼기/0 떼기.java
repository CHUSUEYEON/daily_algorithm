class Solution {
    public String solution(String n_str) {
        String answer = "";
        String[] arr = n_str.split("");
        int idx = 0;
        for(int i = 0 ; i< arr.length ; i++){
            if(!arr[i].equals("0")){
                idx = i;
                break;
            }
        }
        for(int i = idx ; i < arr.length ; i++){
            answer += arr[i];
        }
        
        
        return answer;
    }
}