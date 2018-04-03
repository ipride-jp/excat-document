<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat18_1" scope="request" class="excat.test.TestCase18_1" />

<jsp:setProperty name="cat18_1" property="*" />
<%
	cat18_1.setConfigAndRunCase("test addArrayList ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 18_1 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
