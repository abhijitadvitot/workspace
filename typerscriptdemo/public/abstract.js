var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Person = /** @class */ (function () {
    function Person(name) {
        this.name = name;
    }
    Person.prototype.display = function () {
        console.log(this.name);
    };
    return Person;
}());
var Employe11 = /** @class */ (function (_super) {
    __extends(Employe11, _super);
    function Employe11(name, code) {
        var _this = 
        //this.name=name;
        _super.call(this, name) || this;
        _this.empCode = code;
        return _this;
    }
    Employe11.prototype.find = function (string) {
        return new Employe11(string, 1);
        //throw new Error("Method not implemented.");
    };
    return Employe11;
}(Person));
var emp = new Employe11("Abhijit	", 22);
emp.display();
var emp2 = emp.find("Advitot");
console.log(emp);
console.log(emp2);
