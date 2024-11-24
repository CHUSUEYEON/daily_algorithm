function solution(s) {
    var answer = 0;
    let str = s.split(" ")
    // console.log(str)
    for(i = 0 ; i < str.length ; i++){
        if(str[i] === "Z"){
            answer -= +str[i-1]
        }else answer += +str[i]
    }
    return answer;
}