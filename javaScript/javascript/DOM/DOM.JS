 let h1element= document.getElementById('demo')
console.log('Element =',h1element)
console.log("Element Text ",h1element.textContent)
h1element.textContent = 'Good Evening'
// console.log(h1element.textContent)
// console.log("==================================")
 let buttonelement= document.createElement('button')
 buttonelement.textContent = 'Click Me!!!!'
 console.log(" Button Element ",buttonelement)
// document.body.appendChild(buttonelement)
// let ulelement  = document.createElement('ul')
// let li2element  = document.createElement('li')
// let li3element  = document.createElement('li')
// let li4element  = document.createElement('li')
// li2element.textContent='java'
// li3element.textContent='javascript'
// li4element.textContent='sql'
// ulelement.appendChild(li2element)
// ulelement.appendChild(li3element)
// ulelement.appendChild(li4element)
// document.body.appendChild(ulelement)
// h1element.style.color = 'red'
// li4element.style.color='green'
// h1element.style.fontSize='50px'

function showMessage(){
    alert('HI Hello Welcome !!!!!!!!!!!!!!')
}
function changeColor(){
    let pElement = document.getElementById('mover')
    pElement.style.color= 'green'
    // alert('HI Hello Welcome !!!!!!!!!!!!!!')
}
function removeColor(){
    let pElement = document.getElementById('mover')
    pElement.style.color= 'black'

}
function printHello(){
    console.log('Hello ')
   let username= document.getElementById('userName').value
   document.getElementById('showusername').textContent= username;

}
let name = 'Gajendra'
let age=22
let phoneno=9846756476869
console.log('Name is = '+name+'Age is ='+age+'  Phone number= '+phoneno);
console.log(`Name is ${name } Age is ${ age } Phoneno is ${phoneno}`)
console.log(`2+2 = ${2+2}`)