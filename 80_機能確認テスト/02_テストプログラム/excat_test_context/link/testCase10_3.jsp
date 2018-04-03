<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat10_3" scope="request" class="excat.test.TestCase10_3" />

<jsp:setProperty name="cat10_3" property="*" />
<%
	cat10_3.setConfigAndRunCase("test runtime exception ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 10_3 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
