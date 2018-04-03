<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat11_9" scope="request" class="excat.test.TestCase11_9" />

<jsp:setProperty name="cat11_9" property="*" />
<%
	cat11_9.setConfigAndRunCase("test runtime exception ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 11_9 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
