function solution(n) {
    var answer = []
    let arr = String(n).split("").map((e) => Number(e));
    answer = arr.reverse()

    return answer;
}