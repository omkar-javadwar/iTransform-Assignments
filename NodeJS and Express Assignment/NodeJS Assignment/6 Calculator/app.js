/*
6. Calculator
-----------------
Calculator Node

Create a app.js that require another file called calculator.js When we call node app.js we should show in the console the following:
The sum of 3 & 7 is: 10 The multiplication of 3 & 7 is: 21 app.js should only show in the console the result of calling the
functions sum & multiplication
These methods should be defined (and exported) in calculator.js

Phase 2
Create a folder called operations and create in every folder a file exporting every operation needed in the main app.js file
app.js operations/ sum.js multiplication.js substraction.js division.js

Phase 3
Install the module moment and use it to show the current time in this way. Today is: Monday, October 31st 2016, 10:08:34 am The sum of 3 & 7 is: 10 The multiplication of 3 & 7 is: 21
*/

const addition = require('./operations/sum.js');
const substraction = require('./operations/subtraction.js');
const multiplication = require('./operations/multiplication.js');
const division = require('./operations/division.js');
const calculator = require('./calculator')
const moment = require('moment')

console.log(`Today is: ${moment().format('LLLL')}`);

let a = 3, b = 7;

console.log(`The sum of ${a} & ${b} is: ${calculator.sum(a, b)}`);
console.log(`The multiplication of ${a} & ${b} is: ${calculator.mul(a, b)}`);

a = 10, b = 5;
console.log(`The addition of ${a} and ${b} is: ${addition.add(a, b)}`);
console.log(`The subtraction of ${a} and ${b} is: ${substraction.sub(a, b)}`);
console.log(`The multiplication of ${a} and ${b} is: ${multiplication.mul(a, b)}`);
console.log(`The division of ${a} and ${b} is: ${division.div(a, b)}`);