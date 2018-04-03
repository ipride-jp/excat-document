<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="catP_7" scope="request" class="excat.test.TestCaseP_7" />

<jsp:setProperty name="catP_7" property="*" />
<%
	catP_7.runCase("test RuntimeException");
%>


<FONT size = 5 COLOR="gray">
<br>
test case P_7 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
