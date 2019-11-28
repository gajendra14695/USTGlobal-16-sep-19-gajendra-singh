

var a =[1,2,3,67,55,6];
for(var ele in a)
{
    console.log('Value',a[ele]);
}
console.log("================================");

var a =[1,2,3,67,55,6];
for(var index in a)
{
    if(a[index]%2==0)
    console.log('Even',a[index]);
    else
    console.log(" Odd NUmber is",a[index])
    
}
console.log("================================");

var a =[1,2,3,67,55,6];
// var b=a[0];
for(var value  in a)
{
    console.log(a[value]) 
}
    
    
console.log("================= PRINT INDEX VALUE OF GIVIN VALUE===============");
var d=['Gajendra Singh','Amrit Raj','Sohil','Kirti Vardhan', 'Abhishek Karki'];
for(var value  in d)
{
    if(d[value]=='Gajendra Singh'){
    console.log(d[value] ,"Index value of ",value) ;
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
for(var valueDetail in Mobile){
    // if(Mobile[valueDetail]== 'Red Me')
    console.log(Mobile[valueDetail]);
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
(function(pendrive){
var fact=0;
for(var ValueDetail in pendrive){
     if(fact%2==0){
     console.log('ValueDetail= ',pendrive[ValueDetail]);}
     fact++;
    }
// console.log('Number of Array element: ',count);
})(pendrive)
console.log(" +++++++++++++++++++++++++++++++++++REVERSR OF ARRAY BY FOR OF LOOP ===========================================");
var f =[1,2,3,67,55,6];
var count=f.length-1;
console.log(count);
for(var value in f){
    var z= f[count--];
    console.log(" Reverse Of Array is ",z)

}
console.log("============MAXIMUM AND MKINIMUM NUMBER IN THE ARRAY===================")
var g =[1,2,3,67,55,6];
var count=0;
var z=g[count];
var p=g[count];
for(var value in g){
    if(z<g[value]){
        z=g[value];
    }
    else if(p>g[value]){
        p=g[value];
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
for(var value in m){
    if(z<m[value]){
        f=z;
        z=m[value];
    }
    else if(f<m[value]){
        f=m[value];
    }
    
    
    }
    console.log(" First Maximum Number is ",z);
    console.log("second MAXIMUM Element is ", f);