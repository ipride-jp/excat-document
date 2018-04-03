<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat12_2" scope="request" class="excat.test.TestCase12_2" />

<jsp:setProperty name="cat12_2" property="*" />
<%
	cat12_2.setConfigAndRunCase("test sameTaskTag ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 12_2 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
