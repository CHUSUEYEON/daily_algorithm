function solution(a, b) {
    var answer = 0;
    let ab = String(a) + String(b)
    answer = Math.max(2 * a * b, Number(ab))
    return answer;
}