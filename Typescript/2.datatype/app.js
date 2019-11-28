var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
//let name variable is not a taken in global variable,
var myName = "Gajendra Singh";
console.log(myName, typeof myName);
var age = 20;
console.log(age, typeof age);
var mobileNumber;
console.log(mobileNumber, typeof mobileNumber);
var address;
address = "randhawapuram";
address = 475005;
console.log(address, typeof address);
var calAge = function (int) {
    console.log("age is 26");
};
calAge(30);
var person = /** @class */ (function () {
    function person(name, age) {
        this.name = name;
        this.age = age;
    }
    return person;
}());
var person1 = new person("Gajendra singh", 23);
console.log(person1);
var student = /** @class */ (function (_super) {
    __extends(student, _super);
    function student(name, age, rolln) {
        var _this = _super.call(this, name, age) || this;
        _this.rolln = rolln;
        return _this;
    }
    return student;
}(person));
var studen1 = new student("Rahul", 22, 23);
console.log(studen1);
