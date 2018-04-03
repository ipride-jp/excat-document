<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat37_3" scope="request" class="excat.test.TestCase37_3" />

<jsp:setProperty name="cat37_3" property="*" />
<%
	cat37_3.setConfigAndRunCase("test object array ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 37_3 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
