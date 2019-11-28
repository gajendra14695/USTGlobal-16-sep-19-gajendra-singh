//Named function
function prime(num)
{
    var flage=0;
if(num==0&&num==1)
{console.log('Not Prime ');}
for( var i=2;i<num/2;i++)
{
    if(num%i==0)
    {
        flage=1;
        break;
    }
   
}
if(flage==0)
{
    console.log('Prime number is ',num);
}
else
{
    console.log('Not A Prime ',num);
}
}
prime(10);

// Function Expression 
var prime = function(num)
{
    var flage=0;
    if(num==0&&num==1)
    {console.log('Not Prime ');}
    for( var i=2;i<num/2;i++)
    {
        if(num%i==0)
        {
            flage=1;
            break;
        }
       
    }
    if(flage==0)
    {
        console.log('Prime number is ',num);
    }
    else
    {
        console.log('Not A Prime ',num);
    }
   

}
 prime(10);
 //Self Function
 (function(num)
 {
    var flage=0;
    if(num==0&&num==1)
    {console.log('Not Prime ');}
    for( var i=2;i<num/2;i++)
    {
        if(num%i==0)
        {
            flage=1;
            break;
        }
       
    }
    if(flage==0)
    {
        console.log('Prime number is ',num);
    }
    else
    {
        console.log('Not A Prime ',num);
    }
 })(2)
 //Fat Arrow Function
 var prime = (num)=>
 {
    var flage=0;
    if(num==0&&num==1)
    {console.log('Not Prime ');}
    for( var i=2;i<num/2;i++)
    {
        if(num%i==0)
        {
            flage=1;
            break;
        }
       
    }
    if(flage==0)
    {
        console.log('Prime number is ',num);
    }
    else
    {
        console.log('Not A Prime ',num);
    }
 }
 prime(5);