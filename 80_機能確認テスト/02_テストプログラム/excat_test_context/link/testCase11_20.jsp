<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat11_20" scope="request" class="excat.test.TestCase11_20" />

<jsp:setProperty name="cat11_20" property="*" />
<%
	cat11_20.setConfigAndRunCase("test MethodSignature ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 11_20 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
