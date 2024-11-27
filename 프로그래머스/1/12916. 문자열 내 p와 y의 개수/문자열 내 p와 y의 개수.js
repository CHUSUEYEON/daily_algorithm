function solution(s){
    var answer = true;
    let countP = 0;
    let countY = 0;
    let arr = s.split("")
    countP = arr.filter((e) => e === "p" || e === "P").length
    s.split("").forEach((e) => e === "y" || e === "Y" ? countY++ : null)

    console.log(countP, countY)
    answer = (countP == countY) ? true : false
    return answer;
}