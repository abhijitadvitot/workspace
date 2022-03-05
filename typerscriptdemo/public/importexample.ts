import {age  as old} from "./exportexample";
import {Employee} from "./exportexample";
//import {companyName} from "./variables_export";
// can't import without export assignment to the variable or class'
console.log(old);
let emp:Employee= new Employee("Abhijit Aditot", 77);
console.log(emp.displayEmployee());