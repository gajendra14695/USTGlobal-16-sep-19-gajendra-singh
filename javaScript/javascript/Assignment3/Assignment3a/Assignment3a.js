console.log("10 Program of array and also Using a for loop ");

console.log(" Adding two Array by using A for looping ");
console.log(" Array  merged by using  NAMED FUNCTION   and also using for loop")

var a =[1,2,3,67,55,6];
var b=[67,8,9,10];
function Mergetwo(a,b){
for(var i=0;i<b.length;i++)
{
 a.push(b[i]);
}

console.log(" Array Detail ",a);
}
Mergetwo(a,b);
console.log(" Array  merged by using FUNCTION EXPRESSION and also using for loop")
var merge = function(a,b)
{
    for(var i=0;i<b.length;i++)
    {
        a.concat(b);
    }
  return a;
}
console.log(" array Detail OF THE Thired",merge(a,b));
console.log(" Array  merged by using SELF FUNCTION and also using for loop");
(function(a,b){
    for(var i=0;i<b.length;i++)
    {
        a.concat(b);
    }
   console.log(a)
})(a,b);
console.log(" Array  merged by using FAT FUNCTION and also using for loop");
var merge =(a,b)=>{
    for(var i=0;i<b.length;i++)
    {
        a.concat(b);
    }
   return a;
}
console.log(" Array by FAT FUNCTION ",merge(a,b));
console.log(" Array Sort by using for loop and also function ");
var d=['Gajendra Singh','Amrit Raj','Sohil','Kirti Vardhan', 'Abhishek Karki'];
var e=[9,8,7,6,5,4];
function sort(e){
    for(var i=0;i<e.length;i++){
        for(var j=i+1;j<e.length;j++){
            if(e[i]>e[j]){
                var temp=e[i];
                e[i]=e[j];
                e[j]=temp;
            }
        }
    }
    return e;
}
console.log(" Sorted Array is ",sort(e));

console.log(" FAt Function is using a Sorting Array");
var store= (d)=>{
    for(var i=0;i<d.length;i++){
        for(var j=i+1;j< d.length;j++){
            if(d[i]>d[j]){
                var temp=d[i];
                d[i]=d[j];
                d[j]=temp;
            }
        }
    }
    return d;
}
console.log(" Stroe Array in Ac Oreder",store(d));

console.log(" store the element by using SELF INvoked function");
(function(d){

    for(var i=0;i<d.length;i++){
        for(var j=i+1;j< d.length;j++){
            if(d[i]>d[j]){
                var temp=d[i];
                d[i]=d[j];
                d[j]=temp;
            }
        }
    }
    console.log("Array sorted is ",d)
})(d)
console.log("Element added in Array by Using the FUNCTION Expression  ");
var f=['Gajendra Singh','Amrit Raj','Sohil','Kirti Vardhan', 'Abhishek Karki'];
var added=function(e,d){

 for(var i=0;i<f.length;i++)
    {
        e.push(f);
    }
  return e;
}
console.log("Array is added ",added(e,f));


var a =[1,2,3,67,55,6];
var b=[67,8,9,10];
function Mergetwo(a,b){
for(var i=0;i<b.length;i++)
{
 a.push(b[i]);
}
for(var i=0;i<a.length;i++){
    for(var j=i+1;j< a.length;j++){
        if(a[i]>a[j]){
            var temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    }
}


console.log(" Array Detail ",a);
}
Mergetwo(a,b);
console.log("==========================================")
console.log(" EVEN NUMBER IS ");
var a =[1,2,3,67,55,6];
(function(a){
for(var i=0;i<a.length;i++){
    if(a[i]%2===0)
    console.log("Number is Even ",a[i]);
    else
    console.log("Number is Odd ",a[i]);
}
})(a)
