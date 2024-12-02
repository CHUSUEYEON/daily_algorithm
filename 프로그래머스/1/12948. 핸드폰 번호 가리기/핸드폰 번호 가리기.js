function solution(phone_number) {
    var answer = '';
    if(phone_number.length === 4){
        return phone_number
    }
    let changed_numbers = phone_number.slice(0, -4).split("").map(e => e = "*").join("")
    let last_numbers = phone_number.slice(-4)
    
    answer += changed_numbers
    answer += last_numbers
    
    return answer;
}