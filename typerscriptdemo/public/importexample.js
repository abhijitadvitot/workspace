"use strict";
exports.__esModule = true;
var exportexample_1 = require("./exportexample");
var exportexample_2 = require("./exportexample");
//import {companyName} from "./variables_export";
// can't import without export assignment to the variable or class'
console.log(exportexample_1.age);
var emp = new exportexample_2.Employee("Abhijit Aditot", 77);
console.log(emp.displayEmployee());
