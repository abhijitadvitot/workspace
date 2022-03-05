abstract class Person {
	abstract name: string;
	display(): void {
		console.log(this.name);
	}
	abstract find(name: string): Person;
}
class Employe11 extends Person {
	name: string;
	empCode: number;
	constructor(name: string, code: number) {
		super();
		this.empCode = code;
		this.name = name;
	}
	find(name: string): Person {
		return new Employe11(name, 1);
	}
}
let emp: Person = new Employe11("Abhijit", 11);
emp.display();
let emp2: Person = emp.find("Advitot");
console.log(emp);
console.log(emp2.display);