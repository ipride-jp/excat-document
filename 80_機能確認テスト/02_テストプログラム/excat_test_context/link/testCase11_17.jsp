<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat11_17" scope="request" class="excat.test.TestCase11_17" />

<jsp:setProperty name="cat11_17" property="*" />
<%
	cat11_17.setConfigAndRunCase("test Servlet exception ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 11_17 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
