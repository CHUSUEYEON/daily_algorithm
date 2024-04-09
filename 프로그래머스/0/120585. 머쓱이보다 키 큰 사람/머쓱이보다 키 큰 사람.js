function solution(array, height) {
    var answer = 0;
    array.push(height)
    console.log(array)
    array.sort((a,b)=> a-b)
    
    return array.filter((el)=> el > height).length;
}