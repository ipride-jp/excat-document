<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat11_3" scope="request" class="excat.test.TestCase11_3" />

<jsp:setProperty name="cat11_3" property="*" />
<%
	cat11_3.setConfigAndRunCase("test runtime exception ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 11_3 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
