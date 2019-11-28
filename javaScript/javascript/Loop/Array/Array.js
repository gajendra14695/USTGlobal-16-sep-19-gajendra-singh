const hobbies =[ 'Cooking','Cricket','Pubg','Drancing','Roaming']
console.log(typeof hobbies);
 console.log(Array.isArray(hobbies));//It's Return in boolean
console.log(hobbies.includes('Cricket',6))//It will Check the Cricket is present and also the After the 6 index in the Array 
console.log(hobbies.push('Gitar','Volleyball'))// It will Added in the  Array
console.log(hobbies.pop())//It will Return Last Element of the Array
console.log(hobbies.length)// 
console.log(hobbies.unshift('Numismatics','Singing'))// Add the element to the first position 
console.log(hobbies.shift())//delete the element from the first
const hobbies1 =[ 'Cooking','Cricket','Pubg','Drancing','Roaming']
hobbies1.splice(1,0,'Bird Watching ','PUBG')
console.log(hobbies1)//it will modifie the original array
 const afterslice = hobbies1.slice(2, 4)
//  console.log(hobbies1)
console.log(afterslice)
const indexofCoding=hobbies1.indexOf('Coding',1)
console.log(indexofCoding)
const joinof=hobbies1.join('+')
console.log(joinof)
const number =[100,200,300,400]
const number1=[]
for(let i=0;i<number.length;i++){
    
    
   let num= number[i]+50;
   number1.push(num)
    
}console.log(number1)
const number2=number.map(function(value,index){
let newValue = value+50;
return newValue;
})
console.log("Aftre using callback function",number2)
const number3= number.map(value=>value+50)
console.log("After map Fat Arrow Function",number3)
const numberfilter=number.filter(function(value,index){
if(value>200){
    return true
}else{
    return false
}
})
console.log(numberfilter)
const filternumArrow=number.filter(value=>value>200)
console.log(filternumArrow)
console.log("ASSIGNMENT 1 =======================================================")
const item =[
    {
name:'Ear ring',
id:2,
price:5000,
},
{
    name:' ring',
    id:4,
    price:1000,
    },
    {
        name:'Beardo',
        id:2,
        price:170,
        },
        {
            name:'Trimmer',
            id:4,
            price:6000,
            },
]
const numbe= item.map(value=>value.price+300)
console.log(numbe)
const item1=item.filter(value=>value.price>3000)
console.log(item1)
console.log("ASSIGNMENT 2 =======================================================")
const item2 =[
    {
        
            name:'ar ring',
            id:2,
            price:5000,
            },
            {
                name:'ing',
                id:4,
                price:1000,
                },
                {
                    name:'ardo',
                    id:1,
                    price:170,
                    },
                    {
                        name:'mmer',
                        id:4,
                        price:6000,
                        }
]
console.log(typeof item2)
const num1= item2.map(value=>value.id+150)
console.log(num1)
const item3=item2.filter(value=>value.id>=2)
console.log(item3)
// forEach(function(value) {
//     if(value.name==='mmer')
//     console.log(value)
// });


console.log("ASSIGNMENT 3 =======================================================")
// const item1 =[
//     {
// name:'ar ring',
// id:2,
// price:5000,
// },
// {
//     name:'ing',
//     id:4,
//     price:1000,
//     },
//     {
//         name:'ardo',
//         id:2,
//         price:170,
//         },
//         {
//             name:'mmer',
//             id:4,
//             price:6000,
//             },
// ]
// const numbe= item1.map(value=>value.price+300)
// console.log(numbe)
// const item2=item1.filter(value=>value.price>3000)
// console.log(item2)

// console.log("ASSIGNMENT 4=======================================================")
// const item =[
//     {
// name:'Ear ring',
// id:2,
// price:5000,
// },
// {
//     name:' ring',
//     id:4,
//     price:1000,
//     },
//     {
//         name:'Beardo',
//         id:2,
//         price:170,
//         },
//         {
//             name:'Trimmer',
//             id:4,
//             price:6000,
//             },
// ]
// const numbe= item.map(value=>value.price+300)
// console.log(numbe)
// const item1=item.filter(value=>value.price>3000)
// console.log(item1)

// console.log("ASSIGNMENT 5=======================================================")
// const item =[
//     {
// name:'Ear ring',
// id:2,
// price:5000,
// },
// {
//     name:' ring',
//     id:4,
//     price:1000,
//     },
//     {
//         name:'Beardo',
//         id:2,
//         price:170,
//         },
//         {
//             name:'Trimmer',
//             id:4,
//             price:6000,
//             },
// ]
// const numbe= item.map(value=>value.price+300)
// console.log(numbe)
// const item1=item.filter(value=>value.price>3000)
// console.log(item1)

// console.log("ASSIGNMENT 6=======================================================")
// const item =[
//     {
// name:'Ear ring',
// id:2,
// price:5000,
// },
// {
//     name:' ring',
//     id:4,
//     price:1000,
//     },
//     {
//         name:'Beardo',
//         id:2,
//         price:170,
//         },
//         {
//             name:'Trimmer',
//             id:4,
//             price:6000,
//             },
// ]
// const numbe= item.map(value=>value.price+300)
// console.log(numbe)
// const item1=item.filter(value=>value.price>3000)
// console.log(item1)

// console.log("ASSIGNMENT 7=======================================================")
// const item =[
//     {
// name:'Ear ring',
// id:2,
// price:5000,
// },
// {
//     name:' ring',
//     id:4,
//     price:1000,
//     },
//     {
//         name:'Beardo',
//         id:2,
//         price:170,
//         },
//         {
//             name:'Trimmer',
//             id:4,
//             price:6000,
//             },
// ]
// const numbe= item.map(value=>value.price+300)
// console.log(numbe)
// const item1=item.filter(value=>value.price>3000)
// console.log(item1)

// console.log("ASSIGNMENT 8=======================================================")
// const item =[
//     {
// name:'Ear ring',
// id:2,
// price:5000,
// },
// {
//     name:' ring',
//     id:4,
//     price:1000,
//     },
//     {
//         name:'Beardo',
//         id:2,
//         price:170,
//         },
//         {
//             name:'Trimmer',
//             id:4,
//             price:6000,
//             },
// ]
// const numbe= item.map(value=>value.price+300)
// console.log(numbe)
// const item1=item.filter(value=>value.price>3000)
// console.log(item1)

// console.log("ASSIGNMENT 9 =======================================================")
// const item =[
//     {
// name:'Ear ring',
// id:2,
// price:5000,
// },
// {
//     name:' ring',
//     id:4,
//     price:1000,
//     },
//     {
//         name:'Beardo',
//         id:2,
//         price:170,
//         },
//         {
//             name:'Trimmer',
//             id:4,
//             price:6000,
//             },
// ]
// const numbe= item.map(value=>value.price+300)
// console.log(numbe)
// const item1=item.filter(value=>value.price>3000)
// console.log(item1)

// console.log("ASSIGNMENT 10 =======================================================")
// const item =[
//     {
// name:'Ear ring',
// id:2,
// price:5000,
// },
// {
//     name:' ring',
//     id:4,
//     price:1000,
//     },
//     {
//         name:'Beardo',
//         id:2,
//         price:170,
//         },
//         {
//             name:'Trimmer',
//             id:4,
//             price:6000,
//             },
// ]
// const numbe= item.map(value=>value.id+150)
// console.log(numbe)
// const item1=item.filter(value=>value.id>100)
// console.log(item1)



