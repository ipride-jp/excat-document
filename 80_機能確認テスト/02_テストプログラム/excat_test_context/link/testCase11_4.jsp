<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat11_4" scope="request" class="excat.test.TestCase11_4" />

<jsp:setProperty name="cat11_4" property="*" />
<%
	cat11_4.setConfigAndRunCase("test runtime exception ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 11_4 �����s���܂����B
</FONT>


</html>
