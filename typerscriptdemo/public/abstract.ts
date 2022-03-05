abstract class Person{
    name: string;
    constructor(name: string){
        this.name=name;
    }   
    display(): void{ // concreate method
        console.log(this.name);
    }
    abstract find(string : string):Person;
}
class Employe11 extends Person{
    empCode: number;
    constructor(name:string, code:number){
        //this.name=name;
        super(name);
        this.empCode=code;
    }
    find(string: string): Person {
    return new Employe11(string, 1);
            //throw new Error("Method not implemented.");
    }
}
let emp : Person= new Employe11("Abhijit	", 22);
emp.display();
let emp2:Person =emp.find("Advitot");
console.log(emp);
console.log(emp2);