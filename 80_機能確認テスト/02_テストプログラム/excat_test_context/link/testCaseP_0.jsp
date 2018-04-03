<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="catP_0" scope="request" class="excat.test.TestCaseP_0" />

<jsp:setProperty name="catP_0" property="*" />
<%
	catP_0.runCase("test RuntimeException");
%>


<FONT size = 5 COLOR="gray">
<br>
test case P_0 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
