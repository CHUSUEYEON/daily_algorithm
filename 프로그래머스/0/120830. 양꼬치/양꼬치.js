function solution(n, k) {
    var answer = 0;
    const s = Math.floor(n/10);
    if(s != 0){
        return 12000*n + 2000*(k-s)
    } else
    return 12000*n + 2000*k;
}