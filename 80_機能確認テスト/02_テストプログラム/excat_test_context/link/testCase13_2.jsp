<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat13_2" scope="request" class="excat.test.TestCase13_2" />

<jsp:setProperty name="cat13_2" property="*" />
<%
	cat13_2.setConfigAndRunCase("test exceptionFiter ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 13_2 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
