function solution(my_string, num1, num2) {
    const temp_str = my_string.split("")
    const temp = temp_str[num1];
    temp_str[num1] = temp_str[num2];
    temp_str[num2] = temp;
    const answer = temp_str.join("");
    
    return answer;
}