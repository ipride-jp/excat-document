<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="catP_13" scope="request" class="excat.test.TestCaseP_13" />

<jsp:setProperty name="catP_13" property="*" />
<%
	catP_13.runCase("test RuntimeException");
%>


<FONT size = 5 COLOR="gray">
<br>
test case P_13 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
