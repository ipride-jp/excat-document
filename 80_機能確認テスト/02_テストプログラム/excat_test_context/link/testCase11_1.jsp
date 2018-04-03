<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat11_1" scope="request" class="excat.test.TestCase11_1" />

<jsp:setProperty name="cat11_1" property="*" />
<%
	cat11_1.setConfigAndRunCase("test runtime exception ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 11_1 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
