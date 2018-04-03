<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat10_1" scope="request" class="excat.test.TestCase10_1" />

<jsp:setProperty name="cat10_1" property="*" />
<%
	cat10_1.setConfigAndRunCase("test runtime exception ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 10_1 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
