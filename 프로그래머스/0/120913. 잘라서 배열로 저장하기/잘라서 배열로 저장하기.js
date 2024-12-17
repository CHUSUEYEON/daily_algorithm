function solution(my_str, n) {
    var answer = [];
    while(true){
        if(my_str){
            let str = '';
            str = my_str.substr(0, n)
            answer.push(str)
            my_str = my_str.substr(n)
        }else{
            break
        }
    }
    return answer;
}