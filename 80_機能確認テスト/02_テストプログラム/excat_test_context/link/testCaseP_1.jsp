<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="catP_1" scope="request" class="excat.test.TestCaseP_1" />

<jsp:setProperty name="catP_1" property="*" />
<%
	catP_1.runCase("test RuntimeException");
%>


<FONT size = 5 COLOR="gray">
<br>
test case P_1 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
