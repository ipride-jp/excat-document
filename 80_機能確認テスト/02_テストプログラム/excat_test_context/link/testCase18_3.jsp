<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat18_3" scope="request" class="excat.test.TestCase18_3" />

<jsp:setProperty name="cat18_3" property="*" />
<%
	cat18_3.setConfigAndRunCase("test objectValid=false ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 18_3 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
