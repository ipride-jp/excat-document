<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat16_1" scope="request" class="excat.test.TestCase16_1" />

<jsp:setProperty name="cat16_1" property="*" />
<%
	cat16_1.setConfigAndRunCase("test attributeNestDepth=5 ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 16_1 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
