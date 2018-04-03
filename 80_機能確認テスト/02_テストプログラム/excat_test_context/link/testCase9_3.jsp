<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat9_3" scope="request" class="excat.test.TestCase9_3" />

<jsp:setProperty name="cat9_3" property="*" />
<%
	cat9_3.setConfigAndRunCase("test runtime exception ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 9_3 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
