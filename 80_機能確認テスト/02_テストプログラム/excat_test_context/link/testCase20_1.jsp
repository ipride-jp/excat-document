<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat20_1" scope="request" class="excat.test.TestCase20_1" />

<jsp:setProperty name="cat20_1" property="*" />
<%
	//cat20_1.setConfigAndRunCase('a',123,true,'c',"object");
	cat20_1.setConfigAndRunCase("test object Variable on debug");
%>

<FONT size = 5 COLOR="gray">
<br>
test case 20_1 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
