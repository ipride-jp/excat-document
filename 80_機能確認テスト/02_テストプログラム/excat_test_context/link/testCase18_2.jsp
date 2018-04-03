<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat18_2" scope="request" class="excat.test.TestCase18_2" />

<jsp:setProperty name="cat18_2" property="*" />
<%
	cat18_2.setConfigAndRunCase("test fieldValue=false ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 18_2 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
