function solution(numbers) {
    // let sum = 0;
    // for(let i=0;i<numbers.length;i++){
    //     sum += numbers[i]
    // }
    // return  sum / numbers.length;
    
    return numbers.reduce((a, b)=> (a+b))/numbers.length
    
}