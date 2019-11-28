const message= new Promise(function(resolve,reject){
    if(30<20){
        resolve([{
            name:'gajendra ',

            age:27,
        },
        {
            name:'Shikha Sholki',
        age:21,

        },
       {name:'Nisha Rajput ',
            
       age:21,

       } ,
       {name:'Ritu Rajput',
            
       age:27,

       },
    ])
    }else{
        reject('Failed')
    }
})
console.log(message)
message.then(function(data){
    console.log('Success Message ',data)

}).catch(function(error){
    console.log('Failure Message ',error)

})
console.log("=========================================================================")
const employee= new Promise(function(resolve,reject){
    if(30>20){
        resolve([{
            name:'gajendra ',

            age:24,
        },
        {
            name:'Shikha',
            
            age:22,

        },
       {name:'Sohil ',
            
       age:23,

       } ,
       {name:'Amrit Raj ',
            
       age:22,

       },
    ])
    }else{
        reject('Failed')
    }
})
console.log(employee)
employee.then(function(data){
    console.log('Success Message ',data)

}).catch(function(error){
    console.log('Failure Message ',error)

})
//cloures
function outerfunction(counter){
    function innerFunction(){
        let count;
        counter=counter+10;
        return counter;

    }
    return innerFunction
}

let innerFunc = outerfunction(20)
let counter = innerFunc()
console.log('counter value',counter)