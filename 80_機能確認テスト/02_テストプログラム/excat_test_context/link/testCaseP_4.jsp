<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="catP_4" scope="request" class="excat.test.TestCaseP_4" />

<jsp:setProperty name="catP_4" property="*" />
<%
	catP_4.runCase("test RuntimeException");
%>


<FONT size = 5 COLOR="gray">
<br>
test case P_4 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
