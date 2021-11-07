<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<jsp:include page="thankyou.jsp"></jsp:include>
<%@ taglib uri="/struts-tags" prefix="s" %> 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>
<div class="row">
<div class="col-sm-5"></div>
<div class="col-sm-5" style="margin-top: 150px;"> <s:form theme="simple" cssClass="well form-search" action="loginprocess">
    <h1>Login</h1>
    <s:textfield
            placeholder="Username"
            name="username"
            tooltip="Enter your Name here">
            </s:textfield>  
            <br>
    <s:password
            placeholder="Password"
            name="password"/>
            <br>
            <s:submit value="LOGIN"/>
    
</s:form>
</div>
 <div class="col-sm-2"></div>
</div>
</body>
</html>