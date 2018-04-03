<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="catP_11" scope="request" class="excat.test.TestCaseP_11" />

<jsp:setProperty name="catP_11" property="*" />
<%
	catP_11.runCase("test RuntimeException");
%>


<FONT size = 5 COLOR="gray">
<br>
test case P_11 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
