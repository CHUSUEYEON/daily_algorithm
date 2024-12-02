function solution(numbers) {
    var answer = -1;
    let r = numbers.sort().reduce((a, b) => a + b, 0)
    return answer = 45 - r;
}