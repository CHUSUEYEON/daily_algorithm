class Solution {
    public String[] solution(String my_string) {
        String[] arr = my_string.split(" ");
        int cnt = 0;
        for(String s : arr){
            if(!s.equals("")){
                cnt++;
            }
        }
        System.out.println(cnt);
        String[] answer = new String[cnt];
        int idx = 0;
        for(String s : arr){
            if(!s.equals("")){
                answer[idx++] = s;
            }
        }
        
        return answer;
    }
}