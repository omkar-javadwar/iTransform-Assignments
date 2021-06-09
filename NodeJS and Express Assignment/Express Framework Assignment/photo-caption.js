/*
6. Create a Express server that uses static files. Place an index.html, an image and a css file in a directory named public. Use the index.html to display the photo and some caption text in red or another color using css.
*/

const express = require('express');
const app = express();

app.use(express.static('public'));

app.listen(3000, () => {
  console.log('listening at port 3000');
});