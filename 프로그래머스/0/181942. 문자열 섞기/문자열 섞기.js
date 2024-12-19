function solution(str1, str2) {
    var answer = '';
    
    [...str1].forEach((e, i) => answer += e + str2[i])
    
    
    return answer;
}