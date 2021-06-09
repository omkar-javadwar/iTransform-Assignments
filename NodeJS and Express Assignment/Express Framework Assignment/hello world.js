/*
1. Problem Statement
----------------------
Make a hello world Express program that will display "Hello, world!" at the root
URL: /
*/

const express = require('express');

// express app
const app = express();

// routes
app.get('/', function (req, res) {
  res.send('<h1>Hello, World!</h1>');
})
 
app.listen(3000)