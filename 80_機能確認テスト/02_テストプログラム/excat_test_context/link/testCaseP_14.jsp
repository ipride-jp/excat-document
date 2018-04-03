<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="catP_14" scope="request" class="excat.test.TestCaseP_14" />

<jsp:setProperty name="catP_14" property="*" />
<%
	catP_14.runCase("test RuntimeException");
%>


<FONT size = 5 COLOR="gray">
<br>
test case P_14 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
