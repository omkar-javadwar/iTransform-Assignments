/*
7. Shopping List
-----------------
We will be building a simple application where we will store a shopping list. 
You should use an array to store your items in the shopping list.
Our application should have the following routes:
    1. GET/items - this should render a list of shopping items. 
    2. POST/items - this route should accept form data and add it to the shopping list. 
    3. GET/items/:id - this route should display a single item's name and price.
    4. PATCH/items/:id - this route should modify a single item's name and/or price.
    5. DELETE/items/:id - this route should allow you to delete a specific item from the array.
*/

// Importing modules
const express = require('express');
const bodyParser = require('body-parser');

// Express app
const app = express();

// Initializing array
var items = [{ id: 1, product: 'Milk' }, { id: 2, product: 'Butter' }, { id: 3, product: 'Curd' }, { id: 4, product: 'Panner' }];

// Middleware for parsing bodies from URL
app.use(bodyParser.urlencoded({ extended: false }));

// GET/items
app.get('/items', (req, res) => {
  if (items) {
    res.send(items);
  } else {
    res.send('List is empty. Please add items in the list');
  }
});

// POST/items
app.post('/items', (req, res) => {
  var item = req.body;
  items.push(item);
  res.send('Item added successfully in the list');
});

// GET/items/:id
app.get('/items/:id', (req, res) => {
  const itemId = parseInt(req.params.id);
  const item = items.find(item => item.id === itemId);
  if (item) {
    res.send(item);
  } else {
    res.send('Item is not available in the list');
  }
});

// PATCH/items/:id
app.patch('/items/:id', (req, res) => {
  var item = items.findIndex(item => item.id == req.params.id);
  if (items[item]) {
    items[item].product = req.body.product;
    res.send('Item is updated in the list');
    // console.log(items[item]);
  }
  else {
    res.send('Item is not available in the list');
  }
});

// DELETE/items/:id
app.delete('/items/:id', (req, res) => {
  const itemId = parseInt(req.params.id);
  var item = items.find(item => item.id == itemId);
  if (item) {
    items.splice(items.indexOf(item), 1);
    res.json(items);
  }
  else {
    res.send('Item is not available in the list');
  }
});

// To bind and listen the connections on the specified host and port
app.listen(3000, console.log("Listening on port 3000..."));