<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat16_5" scope="request" class="excat.test.TestCase16_5" />

<jsp:setProperty name="cat16_5" property="*" />
<%
	cat16_5.setConfigAndRunCase("test Thread ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 16_5 �����s���܂����B
</FONT>


</html>
