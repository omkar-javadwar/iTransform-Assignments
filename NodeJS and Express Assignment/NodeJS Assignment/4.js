/* 4. Write a nodeJS program that creates a txt file with the text passed as a parameter.

>node ex5.js "hey ho! let's go" 
The file was saved!

When you open the file the text should be displayed hey ho! Let's go*/

// Importing fs module
var fs = require('fs');

// Writing into file
fs.writeFile('writeME.txt', "hey ho! let's go", function(err){
    if(err){

        // To display an error
        console.log(err);
    }

    // Print message on console
    console.log('The file was saved!');
})
