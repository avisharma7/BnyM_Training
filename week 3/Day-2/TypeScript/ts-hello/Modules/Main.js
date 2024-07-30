"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
//This module imports the function and constant from math.ts and uses them
//importing specific exports
var Math_1 = require("./Math"); //exporting add and pi from Math.ts file
//using the imported function  and constants
var sum = (0, Math_1.add)(10, 30);
console.log(sum);
console.log("value of pi is ".concat(Math_1.pi, "."));
