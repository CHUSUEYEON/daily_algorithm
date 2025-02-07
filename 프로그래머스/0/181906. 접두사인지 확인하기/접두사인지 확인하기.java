class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        String[] strArr = my_string.split("");
        String[] strArr2 = is_prefix.split("");
        if(strArr2.length > strArr.length){
            return 0;
        }
        String str = "";
        
        for(int i = 0 ; i < strArr2.length ; i++){
            str += strArr[i];
        }
        answer = (str.equals(is_prefix)) ? 1 : 0;
        return answer;
    }
}