function solution(arr) {
    var answer = [];
    let min = Math.min(...arr)
    let newArr = arr.filter(e => e !== min)

    newArr.length === 0 ? answer = [-1] : answer = newArr
    
    return answer;
}