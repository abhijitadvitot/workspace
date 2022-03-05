var my = /** @class */ (function () {
    function my(code, name) {
        this.empcode = code;
        this.name = name;
    }
    return my;
}());
var emp = new my(10, "abhijr");
//emp.empcode=10;//eroorr  it it only read
emp.name = 'Abhit';
console.log(emp);
var emp1 = {
    empcode: 10,
    name: "ABhi"
};
var emp2 = {
    empcode: 10,
    name: "Abhijt"
};
console.log(emp1);
console.log(emp2);
var Circle = /** @class */ (function () {
    function Circle() {
    }
    Circle.area = function (radiu) {
        return this.pi * radiu * radiu;
    };
    Circle.pi = 3.14;
    return Circle;
}());
console.log(Circle.pi);
console.log(Circle.area(5));
