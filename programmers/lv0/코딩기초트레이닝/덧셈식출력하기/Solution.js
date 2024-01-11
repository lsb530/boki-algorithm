const readline = require('readline');
const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    input = line.split(' ');
    rl.close();
}).on('close', function () {
    // console.log(`${input[0]} + ${input[1]} = ${(Number(input[0])+Number(input[1]))}`);
    const [a, b] = input.map(Number);
    console.log(`${a} + ${b} = ${a + b}`);
});