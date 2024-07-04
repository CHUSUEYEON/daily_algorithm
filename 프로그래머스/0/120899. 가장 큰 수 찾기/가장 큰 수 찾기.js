function solution(array) {
    var answer = [];
    let max = Math.max(...array);
    let idx = array.indexOf(max);
    answer.push(max, idx);
    return answer;
}