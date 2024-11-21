function solution(n) {
    var answer = 0;
    let a = 1;
    let i = 0;

    while(a <= n){           
        i++
        a *= i
        console.log(answer)
        answer = i - 1
    }
    return answer;
}