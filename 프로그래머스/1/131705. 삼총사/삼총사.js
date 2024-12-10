function solution(number) {
    var answer = 0
    
    for(let i = 0 ; i <number.length ; i++){
        for(let j = i+1 ; j < number.length ; j++){
            for(let k = j+1 ; k < number.length ; k++){
                number[i] + number[j] + number[k] === 0 ? answer++ : 0
            }
        }
    }
    
    
//     let neg = [];
//     let pos = [];
//     number.sort((a,b)=> a-b)
//         .filter(e => e < 0 ? neg.push(e) : pos.push(e));
//     if(pos.includes(0)){
//         neg.filter(e => pos.includes(Math.abs(e)) ? answer++ : 0)    
//     };
    
//     neg.forEach(e => {
//         for(let i=1 ; i < neg.length -1 ; i++){
//             pos.includes(Math.abs(e + neg[i])) ? answer++ : 0
//         }
//     })
    
//     let newPos = pos.filter(e => e > 0)
//     let minus = 0;
//     if(newPos.length > 2){
//      newPos.forEach(e => {
//         for(let i=1 ; i < newPos.length -1 ; i++){
//             let temp = (e + newPos[i]) * -1
//             console.log(temp)
//             neg.includes(temp) ? answer++ : 0
//         }})
//     }else{
//         minus = newPos.reduce((a,b) => a+b, 0)
//         console.log(minus)
//         neg.includes(minus * -1) ? answer++ : 0
//         }
    
    // console.log(number)
    return answer;
}