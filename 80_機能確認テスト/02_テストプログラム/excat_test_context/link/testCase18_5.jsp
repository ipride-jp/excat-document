<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat18_5" scope="request" class="excat.test.TestCase18_5" />

<jsp:setProperty name="cat18_5" property="*" />
<%
	cat18_5.setConfigAndRunCase("test deleteObject ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 18_5 �����s���܂����B
</FONT>


</html>
