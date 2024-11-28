function solution(arr, divisor) {
    var answer = [];
    let divisorFilter = arr.filter((e) => e % divisor === 0)
    answer = !divisorFilter[0] ? [-1] : divisorFilter.sort((a, b) => a - b)
    return answer;
}