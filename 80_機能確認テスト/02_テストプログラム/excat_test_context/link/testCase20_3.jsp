<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat20_3" scope="request" class="excat.test.TestCase20_3" />

<jsp:setProperty name="cat20_3" property="*" />
<%
	cat20_3.setConfigAndRunCase("test deleteObjectElement ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 20_3 �����s���܂����B
</FONT>


</html>
