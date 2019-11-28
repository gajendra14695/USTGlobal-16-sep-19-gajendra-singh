var a =[1,2,3,67,55,6];
for(var ele of a)
{
    console.log('Value',ele);
}
console.log("================================");

var a =[1,2,3,67,55,6];
for(var ele of a)
{
    if(ele%2==0)
    console.log('Even',ele);
    else
    console.log(" Odd NUmber is",ele)
    
}
console.log("================================");

var a =[1,2,3,67,55,6];
// var b=a[0];
for(var value  of a)
{
    console.log(value) 
}
    
    
console.log("================================");
var d=['Gajendra Singh','Amrit Raj','Sohil','Kirti Vardhan', 'Abhishek Karki'];
for(var value  of d)
{
    if(value=='Amrit Raj'){
    console.log(value) ;
    }
}
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
for(var valueDetail of Mobile){
    console.log(valueDetail);
}
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
var count=0;
for(var ValueDetail of pendrive){
    console.log('ValueDetail= ',ValueDetail);
    
    count++;
}
 console.log('Number of Array element: ',count);

 console.log("====================+++++++++++++++++++++++++++++++")
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
(function(pendrive){
var fact=0;
for(var ValueDetail of pendrive){
     if(fact%2==0)
     console.log('ValueDetail= ',ValueDetail);
     fact++;
    }
// console.log('Number of Array element: ',count);
})(pendrive)
console.log(" +++++++++++++++++++++++++++++++++++REVERSR OF ARRAY BY FOR OF LOOP ===========================================");
var f =[1,2,3,67,55,6];
var count=f.length-1;
console.log(count);
for(var value of f){
    var z= f[count--];
    console.log(" Reverse Of Array is ",z)

}
console.log("============MAXIMUM AND MKINIMUM NUMBER IN THE ARRAY===================")
var g =[1,2,3,67,55,6];
var count=0;
var z=g[count];
var p=g[count];
for(var value of g){
    if(z<value){
        z=value;
    }
    else if(p>value){
        p=value;
    }
}console.log("MAXIMIM ",z);
console.log("MINIMUM ",p);
console.log("====================+++++++++++++++++++++++++++++++")

var n=['Gajendra Singh','Amrit Raj','Sohil','Kirti Vardhan', 'Abhishek Karki'];
var m =[1,2,3,67,55,6];
// var d =[n,m];
count =0;
var z=-99999;
var f=-99999;
for(var value of m){
    if(z<value){
        f=z;
        z=value;
    }
    else if(f<value){
        f=value;
    }
    
    
    }
    console.log(" First Maximum Number is ",z);
    console.log("second MAXIMUM Element is ", f);
