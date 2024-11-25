function solution(bin1, bin2) {
    var answer = '';
    
    const temp1 = parseInt(bin1, 2)
    const temp2 = parseInt(bin2, 2)

    answer = (temp1 + temp2).toString(2)

    
    return answer;
}
// 2 + (2 + 1) = 4 + 1
// (8 + 1) + (8+ 4+ 2+ 1) = 16 + 8
// 1 2 4 8 
// 이진수 덧셈(2가 있으면 -2하고, 다음 자릿수에 1더하기)
// 10 + 11 = 21 => 101 / 1001 + 1111 = 2112 => 11000