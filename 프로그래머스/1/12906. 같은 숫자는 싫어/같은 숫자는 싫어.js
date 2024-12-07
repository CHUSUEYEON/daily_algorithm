function solution(arr)
{
    var answer = [];
    arr.forEach((e, i) => {
        if(answer.length === 0 || e !== arr[i-1]){
            answer.push(e)
        }
    } )
    
    return answer;
}