<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="catP_3" scope="request" class="excat.test.TestCaseP_3" />

<jsp:setProperty name="catP_3" property="*" />
<%
	catP_3.runCase("test RuntimeException");
%>


<FONT size = 5 COLOR="gray">
<br>
test case P_3 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
