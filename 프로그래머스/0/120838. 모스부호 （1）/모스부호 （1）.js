function solution(letter) {
    var answer = '';
    let code = letter.split(' '); //	[ '....', '.', '.-..', '.-..', '---' ]
    
    morse = { 
    '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
    '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
    '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
    '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
    '-.--':'y','--..':'z'
    }
    console.log(morse['.']) //e
    
    for(i=0 ; i< code.length;i++){
        const result = morse[code[i]]
        answer += result
        console.log("r", result)
    }
//     let newMorse = Object.keys(morse)
    
//     for(i = 0 ; i < code.length ; i++){
//         const result = newMorse.filter((c)=> c === code[i])
//         console.log(result)
//     }
    
    
    
    return answer;
}