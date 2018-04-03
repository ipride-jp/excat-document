<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat16_2" scope="request" class="excat.test.TestCase16_2" />

<jsp:setProperty name="cat16_2" property="*" />
<%
	cat16_2.setConfigAndRunCase("test attributeNestDepth=15 ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 16_2 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
