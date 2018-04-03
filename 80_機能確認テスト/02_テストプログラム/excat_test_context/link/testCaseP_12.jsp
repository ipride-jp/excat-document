<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="catP_12" scope="request" class="excat.test.TestCaseP_12" />

<jsp:setProperty name="catP_12" property="*" />
<%
	catP_12.runCase("test RuntimeException");
%>


<FONT size = 5 COLOR="gray">
<br>
test case P_12 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
