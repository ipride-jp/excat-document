<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat16_3" scope="request" class="excat.test.TestCase16_3" />

<jsp:setProperty name="cat16_3" property="*" />
<%
	cat16_3.setConfigAndRunCase("test encodeError ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 16_3 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
