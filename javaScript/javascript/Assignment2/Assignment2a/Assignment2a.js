// Named function is
function factorial(num)
{
    if(num==0)
    {
        return 1;
    }
        return num*factorial(num-1);
}
console.log('Factorial of a Number is ',factorial(5))

// Function Expression  Function 
var factorial = function(num)
{
    if(num==0)
    {
        return 1;}
        return num*factorial(num-1);
    
}
console.log('Factorial is ',factorial(6));
// self Invoked Function
(function(num)
{
    if(num==0)
    {
        return 1;}
        return  console.log('Factorial is ',num*factorial(num-1));
        
})(6)
// Fat fumction 
var fact= (x) => {
    
    if(x==0)
    {
        return 1;}
        return x*factorial(x-1);

}
console.log('Factorial is ',fact(4));