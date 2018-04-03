<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat23_1" scope="request" class="excat.test.TestCase23_1" />

<jsp:setProperty name="cat23_1" property="*" />
<%
	cat23_1.setConfigAndRunCase("test Throwable");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 23_1 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
