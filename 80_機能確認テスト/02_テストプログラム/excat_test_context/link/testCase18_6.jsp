<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat18_6" scope="request" class="excat.test.TestCase18_6" />

<jsp:setProperty name="cat18_6" property="*" />
<%
	cat18_6.setConfigAndRunCase("test deleteObjectElement ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 18_6 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
