<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat12_3" scope="request" class="excat.test.TestCase12_3" />

<jsp:setProperty name="cat12_3" property="*" />
<%
	cat12_3.setConfigAndRunCase("test sameMonitoringTargetTag ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 12_3 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
