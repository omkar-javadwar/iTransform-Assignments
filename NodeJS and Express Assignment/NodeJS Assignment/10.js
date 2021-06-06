/*
10. Writing on txt
----------------------
Write a node.JS program that creates a txt file with the text passed as a parameter

    $ node ex5.js "hey ho! let's go"
    The file was saved!
    $ cat myText.txt 
    hey ho! let's go
    Hint: You need fs.writeFile

Extra:
    Improve the previous exercise to user the first parameter as the name of the destination file

More Extra:
    Improve the previous exercise to also read and shows in the console the content of the file

    $ node ex5.js mySuperText.txt "it's a long way to the top..."
    The file was saved!
    it's a long way to the top...

    $ cat mySuperText.txt 
    it's a long way to the top...
*/

var fs = require ('fs');

fs.writeFile('mySuperText.txt', "hey ho! let's go", function(err) {
  if (err) throw err;
  console.log('The file has been saved!');
});

fs.appendFile('mySuperText.txt', "\nit's a long way to the top...", function(err) {
    if (err) throw err;
    console.log('The file has been updated!');
  });

fs.readFile('mySuperText.txt', 'utf8', function(err, data) {  
    if (err) throw err;
    console.log(data);
});