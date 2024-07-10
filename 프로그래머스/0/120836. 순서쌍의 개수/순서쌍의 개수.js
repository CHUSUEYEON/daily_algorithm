function solution(n) {
    var answer = 0;
    const p = [];
    p.push(1)
    for(i=2;i<=n;i++){
        if(n%i === 0){
            p.push(i)
        }
    }
    
    for(j=0;j<p.length;j++){
        answer++;
    }
    
    
    return answer;
}