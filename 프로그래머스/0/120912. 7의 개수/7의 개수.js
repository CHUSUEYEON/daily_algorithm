function solution(array) {
    var answer = 0;
    let str = ""
    for(i = 0 ; i < array.length ; i++){
        str += array[i]
    }
    for(i = 0 ; i < str.length ; i++){
        let val = str.charCodeAt(i)
        if(val == 55){
            answer++
        }
    }
    console.log(str)
    return answer;
}