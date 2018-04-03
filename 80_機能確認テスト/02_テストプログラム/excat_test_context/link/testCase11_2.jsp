<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat11_2" scope="request" class="excat.test.TestCase11_2" />

<jsp:setProperty name="cat11_2" property="*" />
<%
	cat11_2.setConfigAndRunCase("test runtime exception ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 11_2 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
