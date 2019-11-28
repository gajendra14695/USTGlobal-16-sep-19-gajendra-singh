
// Named Function 
function arrays()
{
var array1=[10,20,30,40];
var total=0;
for(var i=0;i<array1.length;i++)
{
   total= total+array1[i]
    
}
console.log('Total is ',total);
}
arrays();
// Function Expression 
var total=function()
{
    var array1=[10,20,30,40];
var total=0;
for(var i=0;i<array1.length;i++)
{
   total= total+array1[i]
    
}
console.log('Total is ',total);

}
total();
// Self Invoked Function
(function(){

    var array1=[10,20,30,40];
var total=0;
for(var i=0;i<array1.length;i++)
{
   total= total+array1[i]
    
}
console.log('Total is ',total);
})()
// Fat Function
var totalarray=()=>
{
    var array1=[10,20,30,40];
var total=0;
for(var i=0;i<array1.length;i++)
{
   total= total+array1[i]
    
}
console.log('Total is ',total);
}
totalarray()