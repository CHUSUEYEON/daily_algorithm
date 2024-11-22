function solution(array, n) {
    var answer = 0;
    array.sort((a,b) => a - b)
    const arr = array.map((v)=> Math.abs(v-n))
    console.log(arr)    
    const min = Math.min(...arr)
    const value = arr.indexOf(min)
    console.log(value)
    answer = array[value]
    return answer;
}