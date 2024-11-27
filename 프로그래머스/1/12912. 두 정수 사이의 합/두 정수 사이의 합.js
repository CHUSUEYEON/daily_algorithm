function solution(a, b) {
    var answer = 0;
    let arr = [];
    if(a > b){
        let temp;
        temp = b;
        b = a;
        a = temp;
    }
    console.log(a,b)
    for(i = a; i <= b ; i++){
        arr.push(i)
    }
        answer = arr.reduce((a,b) => a + b)
        
    return answer;
}