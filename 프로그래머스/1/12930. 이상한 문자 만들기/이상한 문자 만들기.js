function solution(s) {
    var answer = '';
    let arr = s.split(" ")
    arr.forEach((e, i) => {
        let temp = [];
        for(j = 0; j < e.length ; j++){
            j % 2 === 0 ? temp.push(e[j].toUpperCase()) : temp.push(e[j].toLowerCase())
        };
        arr[i] = temp.join("")
    })
    answer = arr.join(" ")  
    return answer;
}