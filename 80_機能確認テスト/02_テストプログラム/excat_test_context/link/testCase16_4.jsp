<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat16_4" scope="request" class="excat.test.TestCase16_4" />

<jsp:setProperty name="cat16_4" property="*" />
<%
	cat16_4.setConfigAndRunCase("test mapAndList ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 16_4 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
