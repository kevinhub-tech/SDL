<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<sb:head/>
<body>
<!-- Struts form is here -->

<s:form theme="bootstrap" cssClass="well form-vertical" action="register">
    <s:textfield
            label="First Name"
            name="firstname"
            id="fname" onblur="fum('fname','errfirstname')"
            tooltip="Enter your First Name here">
<div id="errfirstname" style="color:red"></div> </s:textfield>  
		<s:textfield
            label="last Name"
            name="lastname"
             id="lname" onblur="fum('lname','errlastname')"
            tooltip="Enter your First Name here">
             <div id="errlastname" style="color:red"></div> </s:textfield>  

 <s:textfield
            label="Username"
            name="username"
            id="fname" onblur="fum('fname','errfirstname')"
            tooltip="Enter your First Name here">
<div id="errfirstname" style="color:red"></div> </s:textfield>  

    <s:textfield
            label="Email"
            inputPrepend="@"
            name="email"
             id="em" onblur="checkeid()" maxlength="30">
             <p id="erroremail" style="color:red;"></p>
 <p id="correctemail" style="color:green;"></p></s:textfield>  
 
   <s:password
            label="Password"
            name="password"
            id="pswnum" onblur="fum('pswnum','pswerrnum')"
            tooltip="Enter your password here">
            <div id="pswerrnum" style="color:red"> </div> </s:password>  
  
	<s:textfield
            label="Country"
            name="country"
            tooltip="Enter your country here"/>
    <s:textfield
            label="City"
            name="city"
            tooltip="Enter your City here"/>
    <s:textfield
            label="Company name"
            name="companyname"
            tooltip="Enter your Company Name here"/>
    <s:textfield
            label="Address"
            name="address"
            tooltip="Enter your Address here"/>
    <s:submit cssClass="btn btn-primary"/>
</s:form> 
</body>
<script>
function fum(eid,errid)
{
  var t = document.getElementById(eid).value;
  if (t=="")
  {
  document.getElementById(errid).innerHTML ="The required field must be filled";
  }
  else
  {
    document.getElementById(errid).innerHTML="";
  }
}

<!---l name--->


/*email validation*/
function checkeid()
{
var emailid = document.getElementById("em").value;
if (emailid =="")
{
document.getElementById("erroremail").innerHTML = "You need to fill your email";
}

else
    {
var eid = document.getElementById("em").value;
var first = eid.indexOf("@");
var last = eid.lastIndexOf(".");
if(first<4 || last<first+3)
{
document.getElementById("erroremail").innerHTML="Invalid Email Format";
}
else{
document.getElementById("correctemail").innerHTML="Correct Email Format";
}

}
}

<!---psw--->
function fum1(pid,prrid)
{
  var t = document.getElementById(pid).value;
  if (t=="")
  {
  document.getElementById(prrid).innerHTML ="The required field must be filled";
  }
  else
  {
    document.getElementById(prrid).innerHTML="";
  }
}

<!--- rp psw--->
function fum2(rpid,rprrid)
{
  var t = document.getElementById(rpid).value;
  if (t=="")
  {
  document.getElementById(rprrid).innerHTML ="The required field must be filled";
  }
  else
  {
    document.getElementById(rprrid).innerHTML="";
  }
}

</script>
</html>