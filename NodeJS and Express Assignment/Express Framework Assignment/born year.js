/*
2. Problem Statement
----------------------
Tell the year you were born

Make an express program that will display the year you were born when you report your age in a query parameter. When you type
in http://localhost:3000/year?age=32 into the address bar of your browser, for example, it will display You were born in 1984.

Reference:
https://scotch.io/tutorials/use-expressjs-to-get-url-and-post-parameters
*/

const express = require('express');

const app = express();

app.get('/year', (req, res) => {
    
    res.set({ 'Content-Type': 'text/plain; charset=utf-8' });
    
    const age = req.query.age;
    let currentYear = new Date().getFullYear();
    let year = currentYear - age;
    res.send(`You were born in ${year}.`);
});

app.listen(3000, () => console.log('Application started on port 3000...'));
