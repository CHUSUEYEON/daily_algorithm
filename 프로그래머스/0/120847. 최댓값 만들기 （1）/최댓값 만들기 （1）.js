function solution(numbers) {
    // var answer = 0;
    let result = numbers.sort((a,b)=>a-b)
    // console.log(result)

    // for(let i = result.length-1 ; i >= 0 ; i--){
    //     answer = result[0] * result[1]
    // }
    // console.log(result[])
    // answer = result[] * result[]
    console.log(result[result.length-1])
    return result[result.length-1] * result[result.length -2];
}