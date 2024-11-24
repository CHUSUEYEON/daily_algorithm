function solution(my_string) {
    var answer = 0;
    let str = '';
    for(i = 0 ; i < my_string.length ; i++){
        let val = my_string.charCodeAt(i) - 57
        
        if(val > 0){
            str += ' '
            // console.log(my_string.replace(my_string[i], " "))       
        } else{
            str += my_string[i]
        }
    }
    const arr = str.split(" ")
    for(i = 0 ; i < arr.length ; i++){
        if(i !== " "){
            answer += Number(arr[i])
        }
    }
    
    // console.log(typeof(Number(arr[3])))
    
    // 숫자 아스키코드가 48~57 => 아스키코드에서 57을 뺐을 때 양수면 문자열, 음수나 0이면 숫자
    // 문자를 공백으로 바꾸기
    return answer;
}