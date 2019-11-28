function First(){
    setTimeout(function(){
        console.log('First Function Execution')
    }, 0)
    console.log('Excution')
}
function second()
{
    console.log('Second Function Execution')
}
First();
second();

function First(callback){
    setTimeout(function(){
        console.log('First Function Execution')
        callback();
    }, 0)
 //   console.log('Excution')
}
function second()
{
    console.log('Second Function Execution')
}
First(second);
