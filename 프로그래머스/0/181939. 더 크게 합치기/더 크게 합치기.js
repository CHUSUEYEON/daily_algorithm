function solution(a, b) {
    var answer = 0;
    let A = String(a) + String(b)
    let B = String(b) + String(a)
    answer = A >= B ? Number(A) : Number(B)
    return answer;
}