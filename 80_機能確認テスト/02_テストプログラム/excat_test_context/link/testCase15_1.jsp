<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat15_1" scope="request" class="excat.test.TestCase15_1" />

<jsp:setProperty name="cat15_1" property="*" />
<%
	cat15_1.setConfigAndRunCase("test public fals ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 15_1 �����s���܂����B
</FONT>


</html>
