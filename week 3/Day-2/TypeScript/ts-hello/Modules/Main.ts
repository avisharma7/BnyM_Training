//This module imports the function and constant from math.ts and uses them
//importing specific exports
import { add, pi } from "./Math"; //exporting add and pi from Math.ts file

//using the imported function  and constants
const sum = add(10, 30);
console.log(sum);
console.log(`value of pi is ${pi}.`);
