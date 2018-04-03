<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat18_4" scope="request" class="excat.test.TestCase18_4" />

<jsp:setProperty name="cat18_4" property="*" />
<%
	cat18_4.setConfigAndRunCase("test deleteField ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 18_4 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
