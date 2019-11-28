
function fibonacci(num)
{
    var a=0;
    var b=1;
    console.log(a);
    console.log(b);
    for(var i=0;i<num;i++)
    {
    var c=a+b;
    console.log(c);
    a=b;
    b=c;
    } 
    

}
fibonacci(7);
console.log('======================================================================')
// Function Expression 
var fibonacci = function(num)
{
    var a=0;
    var b=1;
    console.log(a);
    console.log(b);
    for(var i=0;i<num;i++)
    {
    var c=a+b;
    console.log(c);
    a=b;
    b=c;
    } 

}
fibonacci(4);

// Self invoked function
(function(num)
{
    var a=0;
    var b=1;
    console.log(a);
    console.log(b);
    for(var i=0;i<num;i++)
    {
    var c=a+b;
    console.log(c);
    a=b;
    b=c;
    } 
        
})(6)
console.log('======================================================================')
// Fat function 
var fact= (x) => {
    
    var a=0;
    var b=1;
    console.log(a);
    console.log(b);
    for(var i=0;i<x;i++)
    {
    var c=a+b;
    console.log(c);
    a=b;
    b=c;
    } 
}
fact(4)