function solution(my_string) {
    var answer = 0;
    // const result = my_string.filter((a)=> a == number)
    // console.log(result)
    
    for(let i = 0 ; i<my_string.length; i++){
        if(Number(my_string[i])){
            answer += Number(my_string[i] )
        }
    }
 
    return answer ;
}