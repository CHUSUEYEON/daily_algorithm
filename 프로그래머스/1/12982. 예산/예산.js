function solution(d, budget) {
    var answer = 0;
    let temp = [];
    let sum = d.reduce((a, b) => a+b, 0)
    if(sum <= budget){
        return d.length
    }
    
    d.sort((a,b) => a - b)
    for(i = 0 ; i < d.length ; i++){
        temp.push(d[i])
        if(temp.reduce((a,b) => a+b, 0) > budget){
            return temp.length - 1
        }
    }
    
    console.log(d)
    
    return answer;
}