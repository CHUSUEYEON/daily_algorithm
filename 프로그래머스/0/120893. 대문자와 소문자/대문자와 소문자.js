function solution(my_string) {
   var answer = '';
    const result = []
    for(i=0;i<my_string.length;i++){
        if(my_string[i] === my_string[i].toUpperCase()){
result.push(my_string.split("")[i].toLowerCase())
            answer = result.join("")
        }else{
result.push(my_string.split("")[i].toUpperCase())

            answer = result.join("")
        
        }
       
    }
    
    return answer;
}