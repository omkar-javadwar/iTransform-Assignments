/*
4. Problem Statement
----------------------
Make a Node.js program named express-hello-world.js that outputs "Hello World" to browsers making a GET request to the root (/) url.
Also, to browsers that make a GET request to the /time url, send the current date and time in ISO format: 2015-12-31T23:59:59.999Z. Finally, use an environment variable named PORT for the port number if one is provided. If one is not provided use 8080. i.e. The command below should start a server on the port 1337.

PORT=1337 node express-hello-world.js

and the command below should a start server on the port 8080.

node express-hello-world.js
*/

const express = require('express');
const event = new Date();

// express app
const app = express();

// routes
app.get('/', function (req, res) {
    res.send('<h1>Hello, World!</h1>');
})

app.get('/time', function (req, res) {
    res.send(`<h4>${event.toISOString()}</h4>`);
})

app.listen(process.env.port || 8080);