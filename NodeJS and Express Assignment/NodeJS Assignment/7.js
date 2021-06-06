/*
7. Show hour
-------------
Write a nodeJS program that shows you the local hour of server.

Hint: You need npm module> strftime
*/

const moment = require('moment-strftime')

console.log(moment().format('HH:mm'));