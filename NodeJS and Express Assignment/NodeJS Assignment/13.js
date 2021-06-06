/*
13. Write a program that takes a name as a command line argument, and says hello
to that name.

Output:

node hello2.js Jerry Hello, Jerry!

$ node hello2.js Arnav Hello, Arnav!

Reference: https://nodejs.org/docs/latest/api/process.html#process_process_argv
*/

const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
})

readline.question(`What's your name? `, name => {
    console.log(`${name} Hello, ${name}!`)
    readline.close()
})