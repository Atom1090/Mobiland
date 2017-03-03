//Ashour
function checkPhone()
{
    //console.log("phone");
    var str2 = document.getElementById("billing_phone").value;
    var more = /^\(?([0-9]{3})\)?[ ]?([0-9]{3})[ ]?([0-9]{4})$/;
    if (!more.test(str2))
    {
        var error="please Enter Valid Phone";
        document.getElementById("checkph").innerHTML=error;
       // alert("enter valid phone");
    }
}

//Ashour
function checkEmail()
{
    var str= document.getElementById("billing_email").value;
    var patt= /^[_A-Za-z0-9-]+(.[A-Za-z0-9-]+)*@[A-Za-z0-9-]+(.[A-Za-z0-9-]+)*(.[A-Za-z]{2,})$/;
    if(!patt.test(str))
    {
        var error="please Enter Valid Email";
        document.getElementById("checkmail").innerHTML=error;
        //alert("enter valid email");
    }
}
