//Named Functions
function add(num1,num2)
{
    console.log('sum=',num1+num2);

}
add(10,30);
//Function Experssion (Anonymous)
var sub = function(num1,num2)
{
    return num1-num2;

}
var value = sub(20,30);
console.log('value = '+value);
function mul(num1,num2)
{
    console.log('mul=',num1*num2);

}
mul(10,20);
function div(num1,num2)
{
    console.log('div=',num1/num2);

}
div(10,20);
 var f = function(num1,num2)
 {
     return num1%num2;
 }
 var value1 = f(30,15);
 console.log('mod = '+ value1);
 // Constructor Overloading is not done in java script
 //Make t differen t name of mfunction in java script
 // it's always call the resent method in java script
 function add(num1,num2,num3)
 {

    console.log('sum = '+num1+num2+num3);
 }
 add(30,12)
 //FAT Function 
 console.log('nummm')
  getting('hello')
 function getting(msg)
 {
     console.log('hello',msg)
 }
 (function(num1,num2)
 {
     console.log('value += ', num1+num2);
 })(10,20);
   
    var greets =(msg)=>{
     console.log('hello hi',msg);
 } greets('msg')
