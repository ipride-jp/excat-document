<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat17_3" scope="request" class="excat.test.TestCase17_3" />

<jsp:setProperty name="cat17_3" property="*" />
<%
	cat17_3.setConfigAndRunCase("test objectClass=' ' ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 17_3 �����s���܂����B
</FONT>


</html>
