function solution(num_list) {
    var answer = 0;
    let odd = '';
    let even = '';
    num_list.forEach(e => e % 2 === 0 ? even += String(e) : odd += String(e) )
    answer = Number(odd) + Number(even)
    return answer;
}