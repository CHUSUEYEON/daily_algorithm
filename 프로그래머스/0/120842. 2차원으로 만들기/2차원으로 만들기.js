function solution(num_list, n) {
    var answer = [];
    
    // 1, 3, 5, 7 등 num_list에 있는 홀수만 들어가게 해서, n의 개수만큼 새 배열에 넣고, 
    //그 배열은 answer에 넣기.
    
    // num_list의 개수만큼 for문 돌리면 8번 돈다. 여기서 n으로 나누면..?
    // 그냥... n만큼만 돌리는데, 그 시작점이 계속 0,2,4,6으로 나오면 되는 거 아닌가?
    // num_list.slice(2i,n) => 여기서 i가 계속 바뀌어야 함. 
    // slice는 배열로 나옴. slice(시작점, 끝나는 지점)
    for(i = 0 ; i < num_list.length/n ; i++){
        if(i === 0){
            answer.push(num_list.slice(0, n))
        }else{
            let g = num_list.slice(n * i,  (n * i) + n)
            answer.push(g)
            g = [];
        }
            
    }
    return answer;
}