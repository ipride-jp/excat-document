<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat11_10" scope="request" class="excat.test.TestCase11_10" />

<jsp:setProperty name="cat11_10" property="*" />
<%
	cat11_10.setConfigAndRunCase("test runtime exception ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 11_10 �����s���܂����B
</FONT>


</html>
