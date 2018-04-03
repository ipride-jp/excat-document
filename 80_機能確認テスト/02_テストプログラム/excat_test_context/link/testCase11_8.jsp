<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat11_8" scope="request" class="excat.test.TestCase11_8" />

<jsp:setProperty name="cat11_8" property="*" />
<%
	cat11_8.setConfigAndRunCase("test runtime exception ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 11_8 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
