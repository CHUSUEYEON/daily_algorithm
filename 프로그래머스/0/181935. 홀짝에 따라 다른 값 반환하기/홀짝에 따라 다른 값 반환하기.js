function solution(n) {
    var answer = 0;
    answer = n % 2 ? odd(n) : even(n)
    return answer;
}

function odd(n){
    let odd = 0;
    for(i = 1 ; i <= n ; i += 2){
        odd += i
    }
    return odd
}

function even(n){
    let even = 0;
    for(i = 0 ; i <= n ; i += 2){
        even += Math.pow(i,2)
    }
    return even;
}