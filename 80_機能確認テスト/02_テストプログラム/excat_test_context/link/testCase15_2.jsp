<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat15_2" scope="request" class="excat.test.TestCase15_2" />

<jsp:setProperty name="cat15_2" property="*" />
<%
	cat15_2.setConfigAndRunCase("test all fals ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 15_2 �����s���܂����B
</FONT>


</html>
