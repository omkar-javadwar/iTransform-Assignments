/* 1. Write a nodeJS program that execute a connection to server and return success message like "Success, i'm listening from port: 3000"

Hint: You need npm module - http

Reference: https://www.guru99.com/node-js-create-server-get-data.html
*/

// importing http module
var http = require('http')

// creating the server
var server = http.createServer((function (request, response) {
    // setting the content header
    response.writeHead(200, { "Content-Type": "text/plain" });

    // sending the string to the response
    response.end("Hello World!");
}));

// making the server listen on port 3000
server.listen(3000);

// displaying message on console
console.log("Success, i'm listening from port: 3000");