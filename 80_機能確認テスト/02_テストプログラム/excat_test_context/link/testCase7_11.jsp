<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat7_11" scope="request" class="excat.test.TestCase7_11" />

<jsp:setProperty name="cat7_11" property="*" />
<%
	cat7_11.setConfigAndRunCase("test folder");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 7_11 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
