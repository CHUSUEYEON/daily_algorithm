function solution(numer1, denom1, numer2, denom2) {
    var answer = [];
    denom = denom1 * denom2;
    Numer1 = numer1 * denom2;
    Numer2 = numer2 * denom1;
    Numer = Numer1 + Numer2;
    const gcd = getGcd(denom, Numer);
    answer.push(Numer/gcd, denom/gcd);
    return answer
}    

    function getGcd(a, b) {
        return b === 0 ? a : getGcd(b, a % b)
    }

