<%@ taglib uri="/struts-tags" prefix="s" %>  
  
<h3>All Records:</h3> 
 
<s:iterator  value="list">  
<fieldset>  
<s:property value="firstname"/><br/>  
<s:property value="lastname"/><br/>  
<s:property value="username"/><br/>  
<s:property value="email"/><br/>  
<s:property value="password"/><br/>  
<s:property value="country"/><br/>  
<s:property value="city"/><br/>  
<s:property value="companyname"/><br/>  
<s:property value="address"/><br/>  
</fieldset>  
</s:iterator>  