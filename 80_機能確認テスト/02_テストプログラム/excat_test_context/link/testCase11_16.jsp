<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat11_16" scope="request" class="excat.test.TestCase11_16" />

<jsp:setProperty name="cat11_16" property="*" />
<%
	cat11_16.setConfigAndRunCase("test IllegalArgument exception ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 11_16 を実行しました。
</FONT>


</html>
