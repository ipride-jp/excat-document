<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat11_18" scope="request" class="excat.test.TestCase11_18" />

<jsp:setProperty name="cat11_18" property="*" />
<%
	cat11_18.setConfigAndRunCase("test SQL exception ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 11_18 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
