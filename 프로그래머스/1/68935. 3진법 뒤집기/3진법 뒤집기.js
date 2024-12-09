function solution(n) {
    var answer = 0;
    let str = n.toString(3).split("")
    console.log(str)
    
    for(let i = 0 ; i < str.length ; i++){
        answer += Number(str[i]) * Math.pow(3, i)
    }
    
    
    
    return answer;
}