<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat10_2" scope="request" class="excat.test.TestCase10_2" />

<jsp:setProperty name="cat10_2" property="*" />
<%
	cat10_2.setConfigAndRunCase("test runtime exception ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 10_2 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
