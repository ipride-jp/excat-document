<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat37_1" scope="request" class="excat.test.TestCase37_1" />

<jsp:setProperty name="cat37_1" property="*" />
<%
	cat37_1.setConfigAndRunCase("test array ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 37_1 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
