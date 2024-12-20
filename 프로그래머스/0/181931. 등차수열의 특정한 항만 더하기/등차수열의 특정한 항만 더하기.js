function solution(a, d, included) {
    var answer = 0;
    let arr = [];
    arr.push(a)
    for(i=0 ; i < included.length - 1 ; i++){
        let ele;
        ele = arr[i] + d
        arr.push(ele)
    }
    console.log(arr)
    arr.forEach((e, i) => included[i] === true ? answer += e : 0 )
    return answer;
}