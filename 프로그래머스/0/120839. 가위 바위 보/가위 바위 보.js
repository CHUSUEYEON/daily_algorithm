function solution(rsp) {
    var answer = '';
    result = [];
    // rsp.split('')
    for(i = 0 ; i <rsp.length ; i++){
        console.log(rsp[i])
        switch (rsp[i]){
                case '2': result.push(0)
                break;
                case '0': result.push(5)
                break;
                case '5': result.push(2)
                break;
        }
        answer = result.join('')
        
    }
    return answer;
}