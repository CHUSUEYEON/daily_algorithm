function solution(hp) {
    var answer = 0;
    const a = 5;
    const b = 3;
    const c = 1;
    x = Math.floor(hp / a);
    Y = hp % a;
    y = Math.floor(Y / b);
    Z = Y % b;
    z = Z / c;
    answer = x + y + z;
    return answer;
}