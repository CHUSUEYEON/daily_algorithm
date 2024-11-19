function solution(emergency) {
    var answer = [];
    
    // emergency 길이만큼 for문 돌려서 0번째 배열부터 하나씩 비교해서 1부터 값을 넣는 건?
    // 근데 비교를 어떻게 해야 하지
    // 아니면 오름차순해서 3, 24, 76 으로 두고, 각각 순서 준 다음, 그 값으로 치환하는 건?
    
    // console.log(emergency.sort((a, b) => b-a))

    for(i = 0; i< emergency.length ; i++){
        let count = 1
        // console.log("m : ",Math.min(...emergency))
        for(j = 0; j < emergency.length ; j++){
            let a = emergency[i]
            let b = emergency[j]
            if(a !== b && a < b){
                count++   
            }
        }
        answer.push(count)
    }
    // console.log("ee",emergency)
    
    
    return answer;
}