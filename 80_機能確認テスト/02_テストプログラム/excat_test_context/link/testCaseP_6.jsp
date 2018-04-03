<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="catP_6" scope="request" class="excat.test.TestCaseP_6" />

<jsp:setProperty name="catP_6" property="*" />
<%
	catP_6.runCase("test RuntimeException");
%>


<FONT size = 5 COLOR="gray">
<br>
test case P_6 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
