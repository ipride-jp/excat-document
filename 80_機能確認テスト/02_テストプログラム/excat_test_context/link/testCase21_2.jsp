<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat21_2" scope="request" class="excat.test.TestCase21_2" />

<jsp:setProperty name="cat21_2" property="*" />
<%
	cat21_2.setConfigAndRunCase("test deleteObjectElement ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 21_2 �����s���܂����B
</FONT>


</html>
