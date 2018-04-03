<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat9_4" scope="request" class="excat.test.TestCase9_4" />

<jsp:setProperty name="cat9_4" property="*" />
<%
	cat9_4.setConfigAndRunCase("test runtime exception ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 9_4 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
