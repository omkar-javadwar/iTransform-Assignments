/* 3.File List
----------------
Write a nodeJS program that list the content of the current directory indicating if is a directory or a file

For eg:

> node ex4.js
FILE:ex1.js
FILE:ex2.js
FILE:ex3.js
FILE:ex4.js
FILE:getLinksNode.js
FILE:link.txt
DIR:node_modules
FILE:recursiveContentsDir.js
FILE:results.txt
FILE: test.txt
*/

// Setting up the path
const directory = '../Assignments/';

// Importing fs module
const fs = require('fs');

// Reading files
fs.readdir(directory, (err, files) => {
    files.forEach(file => {

        // Displaying files
        console.log(file);
    });
});