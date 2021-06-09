/*
Write a server that, when it receives a GET, reads a file, parses it to JSON, and responds with that content to the user.

The server should respond to any GET that matches the /books resource path. As always, the port is passed in process.argv[2]. The file to read is passed in process.argv[3].

Respond with:
    res.json(object)

Everything should match the /books resource path.
For reading the file, use the fs module, e.g.,
    fs.readFile(filename, callback)

HINTS:

While the parsing can be done with JSON.parse:
    object = JSON.parse(string)

No need to install the fs module. It's part of the core and the Node.js platform.
*/

const { errorMonitor } = require('events')
const express = require('express')
const app = express()
const fs = require('fs')

app.get('/books', function(req, res){
  const filename = process.argv[3]
  fs.readFile(filename, function(err, data) {
    if (err) return res.sendStatus(500)
    try {
      books = JSON.parse(data)
    } catch (err) {
      res.sendStatus(500)
    }
    res.json(books)
  })
})

app.listen(process.argv[2])