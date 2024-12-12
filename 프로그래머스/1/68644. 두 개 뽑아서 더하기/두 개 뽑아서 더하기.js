function solution(numbers) {
    var answer = [];
    
    for(let i = 0; i< numbers.length ; i++){
        for(let j = i + 1 ; j < numbers.length ; j++){
            let e = numbers[i] + numbers[j]
            if(!answer.includes(e)){
                answer.push(e)
            }
        }
    }
    
    answer.sort((a, b) => a - b)
    
    return answer;
}