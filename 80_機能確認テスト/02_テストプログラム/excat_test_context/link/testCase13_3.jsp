<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat13_3" scope="request" class="excat.test.TestCase13_3" />

<jsp:setProperty name="cat13_3" property="*" />
<%
	cat13_3.setConfigAndRunCase("test runtimeExceptionFiter ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 13_3 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
