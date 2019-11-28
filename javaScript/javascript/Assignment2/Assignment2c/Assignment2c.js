// Named Function 
function circum(num)
{
var pi=3.14;
console.log('Circumfrence number is ',2*pi*num);
}
circum(10);


// Function Expression 

var circum = function(num)
{
    var pi=3.14;
console.log('Circumfrence number is ',2*pi*num);

}
circum(10);
//Self Invoked Function
(function(num)
    {
        var pi=3.14;
        console.log('Circumfrence number is ',2*pi*num);
    }
)(5)
// Fat Function 
var circum=(num)=>{
    var pi=3.14;
console.log('Circumfrence number is ',2*pi*num);
}
circum(5);