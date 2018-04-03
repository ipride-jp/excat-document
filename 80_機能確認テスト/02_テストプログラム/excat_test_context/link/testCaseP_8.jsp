<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="catP_8" scope="request" class="excat.test.TestCaseP_8" />

<jsp:setProperty name="catP_8" property="*" />
<%
	catP_8.runCase("test RuntimeException");
%>


<FONT size = 5 COLOR="gray">
<br>
test case P_8 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
