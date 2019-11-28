
//let name variable is not a taken in global variable,
let myName: string = "Gajendra Singh";
console.log(myName, typeof myName);

let age : number=20;

console.log(age , typeof age);

let mobileNumber :9176070061;
console.log(mobileNumber , typeof mobileNumber);
let address;
address  = "randhawapuram";
address= 475005;
console.log(address, typeof address);
let calAge= function(int ): void{
    console.log("age is 26");
}
calAge(30);

class person {
    constructor(public name : string , public age:number){

    }
}
let person1 =new person("Gajendra singh",23);
console.log(person1);
class student extends person{
    constructor(name:string ,age:number , public rolln: number){
super(name,age);
    }
}
let studen1=new student("Rahul", 22,23);
console.log(studen1);