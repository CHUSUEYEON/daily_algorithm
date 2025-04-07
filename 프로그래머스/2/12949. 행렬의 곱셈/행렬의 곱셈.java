class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        // 행렬의 조건 : A의 열의 개수 = B의 행의 개수 
        // 0이 행 1이 열 
        
        int r = arr1.length;
        int c = arr1[0].length;
        int r2 = arr2.length;
        int c2 = arr2[0].length;
        // 결과 배열 초기화 
        int[][] answer = new int[r][c2];
        
        // 첫 번째 행렬 arr1의 각 행과 두 번째 행렬 arr2의 각 열에 대해 
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c2; j++){
                // 두 행렬의 데이터를 곱해 결과 리스트에 더함
                for(int k = 0; k < c; k++){
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;
    }
}