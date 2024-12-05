function solution(s) {
    var answer = true;
    if(s.length !== 4 && s.length !== 6){
        return false
    }
    for(i = 0; i < s.length ; i++){
        if(s.charCodeAt(i) > 64){
            return false
        }
    }
    return answer;
}