<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat11_7" scope="request" class="excat.test.TestCase11_7" />

<jsp:setProperty name="cat11_7" property="*" />
<%
	cat11_7.setConfigAndRunCase("test runtime exception ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 11_7 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
