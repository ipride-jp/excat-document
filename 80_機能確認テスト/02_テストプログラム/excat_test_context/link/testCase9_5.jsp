<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat9_5" scope="request" class="excat.test.TestCase9_5" />

<jsp:setProperty name="cat9_5" property="*" />
<%
	cat9_5.setConfigAndRunCase("test runtime exception ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 9_5 �����s���܂����B
</FONT>


</html>
