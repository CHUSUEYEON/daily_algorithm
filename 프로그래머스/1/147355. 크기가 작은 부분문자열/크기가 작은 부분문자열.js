function solution(t, p) {
    var answer = 0;
    let arr = [];
    let length = p.length
    
    for(i= 0 ; i <= t.length - length ; i++){
        arr.push(t.slice(i, i+length))
    }
    
    answer = arr.filter(e => Number(e) <= Number(p)).length

    return answer;
}