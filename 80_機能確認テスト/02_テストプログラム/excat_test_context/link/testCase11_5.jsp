<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat11_5" scope="request" class="excat.test.TestCase11_5" />

<jsp:setProperty name="cat11_5" property="*" />
<%
	cat11_5.setConfigAndRunCase("test runtime exception ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 11_5 �����s���܂����B
</FONT>


</html>
