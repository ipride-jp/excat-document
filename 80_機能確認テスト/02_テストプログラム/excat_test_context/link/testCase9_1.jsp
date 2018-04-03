<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat9_1" scope="request" class="excat.test.TestCase9_1" />

<jsp:setProperty name="cat9_1" property="*" />
<%
	cat9_1.setConfigAndRunCase("test Throwable ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 9_1 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
