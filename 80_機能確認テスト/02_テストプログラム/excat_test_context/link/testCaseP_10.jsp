<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="catP_10" scope="request" class="excat.test.TestCaseP_10" />

<jsp:setProperty name="catP_10" property="*" />
<%
	catP_10.runCase("test RuntimeException");
%>


<FONT size = 5 COLOR="gray">
<br>
test case P_10 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
