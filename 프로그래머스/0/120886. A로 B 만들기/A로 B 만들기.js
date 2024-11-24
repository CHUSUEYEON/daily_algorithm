function solution(before, after) {
    var answer = 0;
    let beArr = before.split("").sort()
    let afArr = after.split("").sort()
    for(i = 0 ; i < before.length ; i++){
        beArr[i] === afArr[i] ? answer++ : answer--
    }
    answer === before.length ? answer = 1 : answer = 0
    return answer;
}