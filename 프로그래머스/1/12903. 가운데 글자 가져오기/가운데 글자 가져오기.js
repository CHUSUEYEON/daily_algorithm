function solution(s) {
    var answer = '';
    let mid = Math.floor(s.length / 2) 
    if(s.length % 2 === 0){
        answer = s.split("").slice(mid - 1, mid + 1).join("")
    }else{
        answer = s.split("").slice(mid, mid + 1).join("")
    }
    console.log(mid)
    return answer;
}