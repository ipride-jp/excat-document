<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat11_15" scope="request" class="excat.test.TestCase11_15" />

<jsp:setProperty name="cat11_15" property="*" />
<%
	cat11_15.setConfigAndRunCase("test NotBound exception ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 11_15 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
