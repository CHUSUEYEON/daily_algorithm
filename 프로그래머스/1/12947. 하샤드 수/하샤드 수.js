function solution(x) {
    var answer = true;
    let sum = String(x).split("").reduce((total, x) => Number(total) + Number(x), 0)
    if(x % sum !== 0){
        answer = false
    }
    return answer;
}