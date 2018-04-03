<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat11_19" scope="request" class="excat.test.TestCase11_19" />

<jsp:setProperty name="cat11_19" property="*" />
<%
	cat11_19.setConfigAndRunCase("test AppException exception ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 11_19 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
