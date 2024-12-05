function solution(s) {
    var answer = '';
    let arr = []
    for(i = 0 ; i < s.length ; i++){
        let c = s.charCodeAt(i);
        arr.push(c)
    }
    
    let newArr = arr.sort((a,b)=> b - a).filter(e => e > 96)
    
    newArr.forEach(e => {
        let s = String.fromCharCode(e)
        answer += s
    })
    
    if(arr[newArr.length]){
        let upperArr = arr.filter(e => e < 96)
        upperArr.sort((a,b) => b - a)
        upperArr.forEach(e => {
        let s = String.fromCharCode(e)
        answer += s
    })
    }
    // 97보다 작으면 대문자
    return answer;
}