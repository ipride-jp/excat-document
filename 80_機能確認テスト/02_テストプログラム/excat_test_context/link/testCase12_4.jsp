<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat12_4" scope="request" class="excat.test.TestCase12_4" />

<jsp:setProperty name="cat12_4" property="*" />
<%
	cat12_4.setConfigAndRunCase("test addTaskTag ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 12_4 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
