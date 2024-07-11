function solution(my_string) {
    var answer = [];
    const vowels = ['a', 'e', 'i', 'o', 'u'];
    my_string.split('')
    for(i=0; i<my_string.length; i++){
        if(!vowels.includes(my_string[i])){
            answer.push(my_string[i])
        }
    }
    return answer.join('');
}