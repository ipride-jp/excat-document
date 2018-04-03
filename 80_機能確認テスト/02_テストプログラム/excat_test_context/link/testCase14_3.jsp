<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat14_3" scope="request" class="excat.test.TestCase14_3" />

<jsp:setProperty name="cat14_3" property="*" />
<%
	cat14_3.setConfigAndRunCase("test variable argument ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 14_3 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
