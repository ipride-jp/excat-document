<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat11_13" scope="request" class="excat.test.TestCase11_13" />

<jsp:setProperty name="cat11_13" property="*" />
<%
	cat11_13.setConfigAndRunCase("test JM exception ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 11_13 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
