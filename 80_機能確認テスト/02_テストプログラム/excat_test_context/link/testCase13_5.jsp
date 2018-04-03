<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat13_5" scope="request" class="excat.test.TestCase13_5" />

<jsp:setProperty name="cat13_5" property="*" />
<%
	cat13_5.setConfigAndRunCase("test deleteMoniteringTarget ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 13_5 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
