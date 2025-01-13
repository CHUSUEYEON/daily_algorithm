class Solution {
    public int[] solution(int[] arr) {
        // 결과 배열의 크기 계산
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        
        int[] answer = new int[sum];
        
        // 직접 숫자를 배열에 채우기
        int index = 0;
        for(int num : arr) {
            for(int j = 0; j < num; j++) {
                answer[index++] = num;
            }
        }
        
        return answer;
    }
}