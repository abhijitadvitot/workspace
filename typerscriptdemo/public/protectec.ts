class Employee{
	  public name:string
	  protected code:number

constructor(name:string, code:number ){
	this.code=code;
	this.name=name;
	
}	  
}

class sales extends Employee
{
	  private depatment:string
	  constructor(name:string, code:number, depatment:string){
		  super(name,code);
		  this.depatment=depatment;
	}
}

let emp=new sales( "ABhijt" ,10,'sel');

console.log(emp);





