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
var Employee = /** @class */ (function () {
    function Employee(name, code) {
        this.code = code;
        this.name = name;
    }
    return Employee;
}());
var sales = /** @class */ (function (_super) {
    __extends(sales, _super);
    function sales(name, code, depatment) {
        var _this = _super.call(this, name, code) || this;
        _this.depatment = depatment;
        return _this;
    }
    return sales;
}(Employee));
var emp = new sales("ABhijt", 10, 'sel');
console.log(emp);
