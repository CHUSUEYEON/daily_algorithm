const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];
let answer = '';

rl.on('line', function (line) {
    input = [line];
}).on('close',function(){
    str = input[0];
    [...str].filter(e => answer += e.charCodeAt(0) > 96 
                         ? e.toUpperCase() : e.toLowerCase())
    console.log(answer)
    
});