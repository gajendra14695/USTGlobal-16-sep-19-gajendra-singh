console.log("Window Object ",window)
console.log("This Keyword ",this)
// alert('hi')
console.log(this===window)
// alert("Welcome UST Global and TESTYANTRA")
// let confirmdelete =confirm("Are you sure you want to delet")
// console.log("Confim Delete ",confirmdelete)
//  let Username=prompt('What is your name ','Gajendra singh')
//  console.log("Username ",Username)
 const person={
     firstname :'gajendra ',
     age:23,
     lastname:'singh',
     getname:function(){
         console.log(this)
         return this.firstname+"   "+this.lastname
     }
 }
let FullName =person.getname()
console.log('Full Name ',FullName)