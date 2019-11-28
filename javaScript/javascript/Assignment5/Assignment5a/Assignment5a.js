function validation_func(){
    var fname = document.getElementById("firstname").value;
    var password = document.getElementById("passvalue").value;
    alert("inside submit");
}
function validation_function(){
    const show = document.getElementById('passvalue')
    if(show.type ==='password'){
        show.type = 'text'
    }else{
        show.type ='password';
    }

}

function validate_fname(){
    var fname = document.getElementById("firstname").value;
    var fname_len = fname.length;
    if(fname_len < 5 ){
        document.getElementById('err').innerHTML = 'First name should be greater than 4 characters'
        err.style.color ='red';
        document.getElementById("mybtn").disabled = true;
    }else{
        document.getElementById('err').innerHTML = ''
        document.getElementById("mybtn").disabled = false;
    }
}

function validate_password(){
    var password = document.getElementById("passvalue").value;
    var password_len = password.length;
    if(password_len < 6 ){
        document.getElementById('err').innerHTML = 'Password should be greater than 6 characters'
        err.style.color ='red';
        document.getElementById("mybtn").disabled = true;
    }else{
        document.getElementById('err').innerHTML = ''
        document.getElementById("mybtn").disabled = false;
    }

}