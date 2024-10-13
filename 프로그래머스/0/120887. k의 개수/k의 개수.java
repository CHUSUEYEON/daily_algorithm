class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String str = "";
        
        for(int a = i ; a <= j ; a++){
            str += String.valueOf(a);
        }
        
        char[] charArray = str.toCharArray();
        for(char c : charArray){
            if(c - '0' == k){
            answer++;                
            }
        }
        
        return answer;
    }
}