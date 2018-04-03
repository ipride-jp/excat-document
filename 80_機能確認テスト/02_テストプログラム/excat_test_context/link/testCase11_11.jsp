<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat11_11" scope="request" class="excat.test.TestCase11_11" />

<jsp:setProperty name="cat11_11" property="*" />
<%
	cat11_11.setConfigAndRunCase("test runtime exception ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 11_11 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
