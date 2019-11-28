
//Forof loop in javaScript
console.log('FOR OF LOOP')
var array2=['Gaje','Amrit','Chotu','Shoil'];
for(var ele of array2)
{
    console.log('Value',ele);
}
console.log('==================================================')
//For In loop
console.log('FOR IN LOOP')
var array2=['Gaje','Amrit','Chotu','Shoil'];
for(var index in array2)
{
    console.log('Value',array2[index]);//it,Store the Index of the Array
}
// 
console.log('==================================================')

console.log('For in loop of Object')
var person={

    firstname:"gajendra",
    lastname:'singh',
    age:26,
    phoneno:917436346782,
}
for(var Key in person)
{
    console.log('person Detail',person[Key]);
}

// For Each loop
var Movies=['Sholy','Mayabazzar','Jurassic park','Tatanic'];
Movies.forEach(function(Value,index)
{
console.log('Movies name',Value);
})


console.log(" Object are in the array in ")

console.log("+++++++++++++++++++++++++++++++++++++++++")

var item=[
    {
        item:'Bangale',
        id:2,
        Price:100,

    },
    {
        item:'Eyeliner',
        id:1,
        Price:50,
    },
    {
        item:'Watch',
        id:3,
        Price:5000,
    },
    {
        item:'Bike',
        id:4,
        Price:1000000,
    }
]
item.forEach(function(value){

    console.log('item detail=',value)
})
console.log("+++++++++++++++++++++++++++++++++++++++++++++++++++++")
for(var index in item)
{
    console.log('Value',item[index]);//it,Store the Index of the Array
}
console.log("+++++++++++++++++++++++++++++++++++++++++")
for(var ele of item)
{
    console.log('Value',ele);
}
console.log("+++++++++++++++++++++++++++++++++++++++++")
for(var i=0;i<item.length;i++)
{
    console.log("hgdsfhgdsf",item[i])
}
console.log("+++++++++++++++++++++++++++++++++++++++++")
var num=[1,2,3,5,7]
num[6]=8;
num[8]=9;
for(var i=0;i<num.length;i++)
{
    console.log("Array Detail ",num[i])
}

console.log("++++++++++++++++++++++EMPTY ELEMENT+++++++++++++++++++")
var a =[1,2,3,,]
for(var i=0;i<a.length;i++)
{
    console.log("value",a[i]);
}
console.log("++++++++++++++++++++++EMPTY ELEMENT+++++++++++++++++++")

a.forEach(function(value){

    console.log('item detail=',value)
})
console.log("++++++++++++++++++++++EMPTY ELEMENT+++++++++++++++++++")
a['hundred']=100;
for(var i=0;i<a.length;i++)
{
    console.log("value",a[i]);
}