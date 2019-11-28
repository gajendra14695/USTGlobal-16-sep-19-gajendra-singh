
var a =[1,2,3,67,55,6];
a.forEach(function(value,key)
{
    console.log('Value',value,"Index ",key);
})

console.log("================================");

var a =[1,2,3,67,55,6];
a.forEach(function(value,key)
{
    if(key%2==0)
    console.log('Value of EVEN Index ',value);
    else
    console.log("Value of ODD Index is ",value);
})
console.log("================================");

var a =[1,2,3,67,55,6];
// var b=a[0];
a.forEach(function(value,key)
{
    if(value%2==0)
    console.log('Value',value,"Index ",key);
})
    
console.log("================= PRINT INDEX VALUE OF GIVIN VALUE===============");
var d=['Gajendra Singh','Amrit Raj','Sohil','Kirti Vardhan', 'Abhishek Karki'];

d.forEach(function(value,key)
{
    if(value=='Abhishek Karki'&& key==4)
    console.log('Value',value,"Index ",key);
})
console.log("============++++++++++++++++++++++++++++++++")
var Mobile=[
    {
        Name:'Sansung',
        version:'M10',
        Price:11000,
    },
    {   Name:'Nokia',
        version:8.1,
        Price:17000,
    },
    {  Name:'Red Me',
        version:'Note 7s',
        Price:12000,
    },
    { Name:'Real Me',
    version:'Note 5s',
    Price:9000,
    },
];
Mobile.forEach(function(value,key)
{
    if(key==3)
    console.log('Value',value,"Index ",key);
})
console.log("============++++++++++++++++++++++++++++++++")
var pendrive=[
    {
        Name:'H.P',
        version:'32gb',
        Price:500,
    },
    {   Name:'Sandisk',
        version:'32gb',
        Price:600,
    },
    {  Name:'Sandisk',
        version:'64gb',
        Price:1200,
    },
    { Name:'H.p',
    version:'64gb',
    Price:1500,
    },
];
pendrive.forEach(function(value,key){
console.log("Deatil of pendrive  With company ",value)
})
 console.log("====================+++++++fsdfdfkdkgmdkndkfmdfgd++++++++++++++++++++++++")
 var pendrive=[
    {
        Name:'H.P',
        version:'32gb',
        Price:500,
    },
    {   Name:'Sandisk',
        version:'32gb',
        Price:600,
    },
    {  Name:'Sandisk',
        version:'64gb',
        Price:1200,
    },
    { Name:'H.p',
    version:'64gb',
    Price:1500,
    },
];

pendrive.forEach(function(value,key){
    if(key%2==0)
    console.log("Deatil of pendrive  With company ",value)
    })

console.log(" +++++++++++++++++++++++++++++++++++REVERSR OF ARRAY BY FOR OF LOOP ===========================================");
var f =[1,2,3,67,55,6];
var count=f.length-1;
console.log(count);
f.forEach(function(value){

    var z= f[count--];
    console.log(" Reverse Of Array is ",z)
})
console.log("============MAXIMUM AND MKINIMUM NUMBER IN THE ARRAY===================")
var g =[0,2,3,67,55,6];
var count=0;
var z=g[count];
var p=g[count];
g.forEach(function(value,key){
    if(z<value){
        z=value;
    }
    else if(p>value){
        p=value;
    }
})
console.log("MAXIMIM ",z);
console.log("MINIMUM ",p);
console.log("====================+++++++++++++++++++++++++++++++")

var n=['Gajendra Singh','Amrit Raj','Sohil','Kirti Vardhan', 'Abhishek Karki'];
var m =[1,2,3,67,55,96];
// var d =[n,m];
count =0;
var z=-99999;
var f=-99999;
m.forEach(function(value,key){
    if(z<value){
        f=z;
        z=value;
    }
    else if(f<value){
        f=value;
    }
    
    
    })
    console.log(" First Maximum Number is ",z);
    console.log("second MAXIMUM Element is ", f);
