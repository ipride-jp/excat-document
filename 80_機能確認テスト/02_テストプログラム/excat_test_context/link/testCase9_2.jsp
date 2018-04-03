<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat9_2" scope="request" class="excat.test.TestCase9_2" />

<jsp:setProperty name="cat9_2" property="*" />
<%
	cat9_2.setConfigAndRunCase("test runtime exception ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 9_2 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
