function solution(n) {
    var answer = 0;
    let sqrt = Math.sqrt(n)
    answer = Number.isInteger(sqrt) ? Math.pow(sqrt + 1, 2) : -1
    return answer;
}