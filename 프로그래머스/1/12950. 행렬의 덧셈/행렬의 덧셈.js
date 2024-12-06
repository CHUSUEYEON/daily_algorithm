function solution(arr1, arr2) {
    var answer = [];
    // answer.push(arr1, arr2)
    // arr1[0][0] + arr2[0][0]
    // arr1[0][1] + arr2[0][1]
    // arr1[1][0] + arr2[1][0]
    // arr1[1][1] + arr2[1][1]
    for(i = 0; i<arr1.length;i++){
        let arr3 =[];
        for(j=0; j < arr1[i].length ; j++){
            arr3.push(arr1[i][j] +arr2[i][j])
        }
        answer.push(arr3)
    }
    console.log(answer)
    return answer;
}