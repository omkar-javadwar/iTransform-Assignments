/*
11. Make a file containing some content. Write a program which can read the file from the current directory and output it to to console.
*/

var fs = require('fs');

console.log('Reading the file readME.txt...');
fs.readFile('readME.txt', 'utf8', function(err, data) {  
    if (err) throw err;
    console.log(data);
});