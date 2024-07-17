function solution(box, n) {
    var answer = 1;
    const result = [];
    for(i=0;i<box.length;i++){
        result.push(Math.floor(box[i]/n))
    }
    result.forEach((e)=>{
        answer *= e
    })
    return answer;
}