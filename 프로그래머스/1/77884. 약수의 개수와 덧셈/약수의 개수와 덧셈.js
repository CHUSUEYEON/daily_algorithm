function solution(left, right) {
    var answer = 0;
    for(i = left ; i <= right; i++){
        let count = 0;
        for(j = 1; j <= i ; j++){
            if(i % j === 0){
                count++
            }
        }
        count % 2 ? answer = answer - i : answer += i
    }
    
    return answer;
}