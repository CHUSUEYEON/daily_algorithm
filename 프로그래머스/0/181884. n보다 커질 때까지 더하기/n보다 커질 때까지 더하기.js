function solution(numbers, n) {
    var answer = 0;
    let idx = 0;
    while(answer <= n){
        answer += numbers[idx++];
    }
    return answer;
}