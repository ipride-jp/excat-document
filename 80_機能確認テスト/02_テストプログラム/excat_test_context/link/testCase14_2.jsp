<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat14_2" scope="request" class="excat.test.TestCase14_2" />

<jsp:setProperty name="cat14_2" property="*" />
<%
	cat14_2.setConfigAndRunCase("test stackTraceDepth=15 ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 14_2 �����s���܂����B
</FONT>


</html>
