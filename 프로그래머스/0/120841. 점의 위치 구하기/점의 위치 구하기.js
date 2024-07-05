function solution(dot) {
    var answer = 0;
    x = dot[0];
    y = dot[1];
    
    x > 0 ? (y > 0 ? answer = 1 : answer = 4) : (y > 0 ? answer = 2 : answer = 3);
    return answer;
}