function solution(n) {
    var answer = '';
    let su = "수"
    let bak = "박"
    
    for(i = 1 ; i <= n ; i++){
        i % 2 === 0 ? answer += bak : answer += su
    }
    return answer;
}