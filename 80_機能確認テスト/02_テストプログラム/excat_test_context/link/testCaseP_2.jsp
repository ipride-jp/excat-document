<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="catP_2" scope="request" class="excat.test.TestCaseP_2" />

<jsp:setProperty name="catP_2" property="*" />
<%
	catP_2.runCase("test RuntimeException");
%>


<FONT size = 5 COLOR="gray">
<br>
test case P_2 �����s���܂����B
</FONT>


</html>
