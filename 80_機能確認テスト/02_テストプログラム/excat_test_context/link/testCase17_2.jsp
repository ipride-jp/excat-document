<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat17_2" scope="request" class="excat.test.TestCase17_2" />

<jsp:setProperty name="cat17_2" property="*" />
<%
	cat17_2.setConfigAndRunCase("test maxValue ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 17_2 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
