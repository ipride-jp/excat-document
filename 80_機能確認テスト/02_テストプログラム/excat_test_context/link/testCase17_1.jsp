<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat17_1" scope="request" class="excat.test.TestCase17_1" />

<jsp:setProperty name="cat17_1" property="*" />
<%
	cat17_1.setConfigAndRunCase("test objectElement ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 17_1 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
