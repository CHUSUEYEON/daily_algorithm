function solution(my_string, n) {
    // var answer = '';
    const a = [...my_string]
   const answer = a.slice(-n).join("")
   
    return answer
}