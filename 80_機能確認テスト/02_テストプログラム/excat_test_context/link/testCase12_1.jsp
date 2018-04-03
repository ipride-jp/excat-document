<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat12_1" scope="request" class="excat.test.TestCase12_1" />

<jsp:setProperty name="cat12_1" property="*" />
<%
	cat12_1.setConfigAndRunCase("test wildcard ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 12_1 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
