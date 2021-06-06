/* 2. Show Content
--------------------

Write a node program that read a file (passed as parameter) in local machine and shows in the console the content of it.

node app.js test.txt
Hint: You need npm module - fs*/

// Import fs module
const fs = require('fs')

// To read a file
fs.readFile('test.txt', 'utf8', function (err, data) {

    // To check error is there or not
    if (err) {

        // To display error
        console.log(err);
    }

    // To display data
    console.log(data);
});