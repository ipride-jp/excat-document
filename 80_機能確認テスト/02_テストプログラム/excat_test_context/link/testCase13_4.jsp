<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat13_4" scope="request" class="excat.test.TestCase13_4" />

<jsp:setProperty name="cat13_4" property="*" />
<%
	cat13_4.setConfigAndRunCase("test changeMonitoringPlace ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 13_4 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
