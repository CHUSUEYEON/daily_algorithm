function solution(num_list) {
    var answer = 0;
    let multi = num_list.reduce((a, b) => a * b, 1)
    let sum = num_list.reduce((a, b) => a + b, 0)
    answer = multi > Math.pow(sum, 2) ? 0 : 1
    return answer;
}