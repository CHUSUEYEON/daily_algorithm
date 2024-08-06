function solution(order) {
    var answer = [...String(order)].filter((a)=>['3', '6', '9'].includes(a)).length
    return answer;
}