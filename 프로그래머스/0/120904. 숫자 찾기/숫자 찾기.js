function solution(num, k) {
    var answer = 0;
    const arr = [...String(num)]
    const result = arr.indexOf(String(k)) + 1
    arr.includes(String(k)) ? answer = result : answer = -1
    
    return answer;
}