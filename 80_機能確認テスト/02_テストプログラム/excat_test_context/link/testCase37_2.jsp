<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat37_2" scope="request" class="excat.test.TestCase37_2" />

<jsp:setProperty name="cat37_2" property="*" />
<%
	cat37_2.setConfigAndRunCase("test object array ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 37_2 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
