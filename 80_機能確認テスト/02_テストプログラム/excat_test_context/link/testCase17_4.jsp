<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat17_4" scope="request" class="excat.test.TestCase17_4" />

<jsp:setProperty name="cat17_4" property="*" />
<%
	cat17_4.setConfigAndRunCase("test fieldName=' ' ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 17_4 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
