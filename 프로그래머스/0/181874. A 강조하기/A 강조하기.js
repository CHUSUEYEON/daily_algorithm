function solution(myString) {
    var answer = '';
    myString.split("").filter(e => {
        if(e === 'a' || e === 'A'){
            answer += 'A'
        }else{
            answer += e.toLowerCase()
        }
    })

    return answer;
}