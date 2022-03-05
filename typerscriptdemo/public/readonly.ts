
class my{
	readonly empcode:number;
	name:string;
	  constructor(code:number, name:string)
	  {
  this.empcode=code;
  this.name=name;
  
}
}

let emp=new my(10,"abhijr");
//emp.empcode=10;//eroorr  it it only read
emp.name='Abhit'
 console.log(emp);
 
 
 
 interface Employee{
	  empcode:number;
	  name:string;
	  
	  
}

let emp1:Readonly<Employee>={
	  empcode:10,
	  name:"ABhi"
}


let emp2:Employee={
	  empcode:10,
	  name:"Abhijt"
	  
}
console.log(emp1);
console.log(emp2);






class Circle{
	  static pi:number=3.14
	  static area(radiu:number):number{
		return this.pi*radiu*radiu
		
	}
}


console.log(Circle.pi);
console.log(Circle.area(5)); 