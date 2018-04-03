<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="catP_9" scope="request" class="excat.test.TestCaseP_9" />

<jsp:setProperty name="catP_9" property="*" />
<%
	catP_9.runCase("test RuntimeException");
%>


<FONT size = 5 COLOR="gray">
<br>
test case P_9 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
