function solution(a, b) {
    var answer = 1234567890;
    let arr = []
    
    a.forEach((e, i) => arr.push(e * b[i]))
    answer = arr.reduce((a,b) => a + b, 0)
    
    return answer;
}