function solution(sides) {
    var answer = 0;
    // console.log(Math.max(...sides))
    let arr = sides.sort();
  console.log(arr);
  answer = arr[0] + arr[1] > arr[2] ? 1 : 2;
  console.log(answer);
  return answer;
}