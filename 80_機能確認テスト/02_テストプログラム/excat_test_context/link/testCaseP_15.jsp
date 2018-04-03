<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="catP_15" scope="request" class="excat.test.TestCaseP_15" />

<jsp:setProperty name="catP_15" property="*" />
<%
	catP_15.runCase("test RuntimeException");
%>


<FONT size = 5 COLOR="gray">
<br>
test case P_15 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
