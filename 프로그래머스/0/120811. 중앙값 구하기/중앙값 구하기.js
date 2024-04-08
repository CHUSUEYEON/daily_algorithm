function solution(array) {
    
let arr = array.sort((a,b) => a-b)



    return arr[Math.floor(arr.length/2)];
// return array
}