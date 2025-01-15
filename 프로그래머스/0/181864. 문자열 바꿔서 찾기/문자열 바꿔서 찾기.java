class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String[] arr = myString.split("");
        myString = "";
        for(String s : arr){
            s = s.equals("A") ? "B" : "A";
            myString += s;
        }
        
        if(myString.contains(pat)){
            answer = 1;
        }
        return answer;
    }
}