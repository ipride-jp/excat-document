<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat14_4" scope="request" class="excat.test.TestCase14_4" />

<jsp:setProperty name="cat14_4" property="*" />
<%
	cat14_4.setConfigAndRunCase("test all true ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 14_4 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
