function solution(n) {
    var answer = 0;
    result = [];
    for(i = 0 ; i <= n ; i++){
     Math.pow(i, 2) === n ? result.push(1) : result.push(2)
    }
    result.includes(1) ? answer = 1 : answer = 2
    return answer;
}