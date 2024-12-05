function solution(price, money, count) {
    var answer = -1;
    let total = 0
    for(i = 1 ; i <= count ; i++){
        total += price * i
    }
    console.log(total)
    answer = money < total ? total - money : 0
    

    return answer;
}