<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="catP_5" scope="request" class="excat.test.TestCaseP_5" />

<jsp:setProperty name="catP_5" property="*" />
<%
	catP_5.runCase("test RuntimeException");
%>


<FONT size = 5 COLOR="gray">
<br>
test case P_5 �����s���܂����B
</FONT>


</html>
