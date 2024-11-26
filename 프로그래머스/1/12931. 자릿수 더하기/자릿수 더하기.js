function solution(n)
{
    var answer = 0;
    let str = '';
    
    str += n;
    let arr = str.split('');
    
    arr.forEach((e)=> answer += +e)
    

    return answer;
}