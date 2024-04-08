function solution(my_string, letter) {
    var answer = '';
    for(let i = 0; i < my_string.length ; i++){
            console.log(my_string[i])
        if(my_string[i] !== letter){
            console.log(letter)
            answer += my_string[i]
        }
    }
    return answer;
}