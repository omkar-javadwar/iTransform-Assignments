/* 9. Processing values
------------------------
Write a node program that process local txt and return values as a Array.

Hint: You need npm module> concat stream */

var fs = require('fs')
var concat = require('concat-stream')

console.log('Reading the file test.txt...');
fs.readFile('test.txt', 'utf8', function(err, data) {  
    if (err) throw err;
    console.log('Returning the values of the file as a array:');
    var data = data.split(' ');
    console.log(data);
});