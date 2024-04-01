function solution(n) {
    var answer = 0;
    const str = String(n)
    const newArr = Array.from(str)
    // console.log(newArr)
    for(let i = 0; i < newArr.length; i++){
        answer += Number(newArr[i])
    }
    return answer;
}