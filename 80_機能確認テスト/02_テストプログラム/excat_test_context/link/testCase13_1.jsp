<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat13_1" scope="request" class="excat.test.TestCase13_1" />

<jsp:setProperty name="cat13_1" property="*" />
<%
	cat13_1.setConfigAndRunCase("test notMoniteringTarget ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 13_1 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
