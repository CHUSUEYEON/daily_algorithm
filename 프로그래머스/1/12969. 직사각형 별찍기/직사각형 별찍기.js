process.stdin.setEncoding('utf8');
process.stdin.on('data', data => {
    const n = data.split(" ");
    const a = Number(n[0]), b = Number(n[1]);
    // console.log(a); //n 가로의 길이
    // console.log(b); //m 세로의 길이
    let star = "";
    for(i = 0 ; i < a ; i++){
        star += "*"
    }
    
    for(i=0 ; i < b ; i++){
        console.log(star)
    }
    
});