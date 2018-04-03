<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat20_2" scope="request" class="excat.test.TestCase20_2" />

<jsp:setProperty name="cat20_2" property="*" />
<%
	cat20_2.setConfigAndRunCase("test deleteObjectElement ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 20_2 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
