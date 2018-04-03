<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat11_6" scope="request" class="excat.test.TestCase11_6" />

<jsp:setProperty name="cat11_6" property="*" />
<%
	cat11_6.setConfigAndRunCase("test runtime exception ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 11_6 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
