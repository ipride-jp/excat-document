<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat7_5" scope="request" class="excat.test.TestCase7_5" />

<jsp:setProperty name="cat7_5" property="*" />
<%
	cat7_5.setConfigAndRunCase("test Throwable");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 7_5 �����s���܂����B
</FONT>


</html>
