<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat10_4" scope="request" class="excat.test.TestCase10_4" />

<jsp:setProperty name="cat10_4" property="*" />
<%
	cat10_4.setConfigAndRunCase("test runtime exception ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 10_4 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
