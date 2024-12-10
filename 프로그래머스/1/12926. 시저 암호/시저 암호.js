function solution(s, n) {
    var answer = '';
    let arr = s.split("")

    arr.forEach(e => {
        if(e.charCodeAt(0) < 91){ // 대문자
            let char = e.charCodeAt(0) + n
            if(char > 90){
                char = char - 26
            }
            answer += e === " " ? " " : String.fromCharCode(char) 
        }else{
            let char = e.charCodeAt(0) + n
            if(char > 122){
                char = char - 26
            }
            answer += e === " " ? " " : String.fromCharCode(char)
        }
    })

    return answer;
    
    // A : 65 / a: 97 / Z : 90 / z : 122
}