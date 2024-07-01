function solution(cipher, code) {
    var answer = '';
    const result = [];
    for(i=1; i < cipher.length/code+1 ; i++){
    
        result.push(cipher.split('')[code * i-1])
        answer = result.join('')
    }

    return answer;
}