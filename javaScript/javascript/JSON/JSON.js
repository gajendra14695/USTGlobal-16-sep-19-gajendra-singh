const person ={
    name:"gajendra Singh",
    age:23,
    color:"white",
    hobbies :['Coding','playing'],
    address:{
        city:"Gwalior",
        state:"Madhya Pradesh",
        pincode:475005
        }
    
    
}
console.log("Javascript person object",person)
const jsonobject=JSON.stringify(person)//convert javascript ot JSON 
console.log("Json of object ",jsonobject)
const javascriptobject=JSON.parse(jsonobject)//convert JSON TO javascript
console.log('Javascript of object',javascriptobject)
localStorage.setItem('email','gajendrasingh@gmail.com')
const emailId =localStorage.getItem('email')
console.log('email',emailId)
localStorage.clear();