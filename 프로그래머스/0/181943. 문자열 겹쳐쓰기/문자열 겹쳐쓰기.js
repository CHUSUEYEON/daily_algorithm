function solution(my_string, overwrite_string, s) {
    var answer = '';
    let n = my_string.length - overwrite_string.length - s
    answer = my_string.substr(0, s) + overwrite_string
    if(my_string.length - answer.length > 0){
        answer += my_string.substr(-n)
    }
    return answer;
}