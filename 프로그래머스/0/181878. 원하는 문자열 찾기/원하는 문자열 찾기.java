class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String MS = myString.toUpperCase();
        String PAT = pat.toUpperCase();
        
        answer = MS.contains(PAT) ? 1 : 0;
        
        return answer;
    }
}