/* 5. Compare Values
----------------------
Write a node JS program that search information in txt file and returns you how much coincidences find.

If you search about "John", and in your txt files are 2 John, should return 2

Hint: You can try save all data in one array and compare with search..*/

const fs = require("fs");

var file = fs.readFileSync("readME.txt", "utf8");
var arr = file.split('\n');

var count = 0;

for (var i = 0; i < arr.length; i++) {
    if (arr[i].includes("John")) {
        count += 1;
    }
}
console.log(count);
