<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat11_12" scope="request" class="excat.test.TestCase11_12" />

<jsp:setProperty name="cat11_12" property="*" />
<%
	cat11_12.setConfigAndRunCase("test runtime exception ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 11_12 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
