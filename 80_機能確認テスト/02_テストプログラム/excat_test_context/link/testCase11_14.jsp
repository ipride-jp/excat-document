<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat11_14" scope="request" class="excat.test.TestCase11_14" />

<jsp:setProperty name="cat11_14" property="*" />
<%
	cat11_14.setConfigAndRunCase("test NoSuchMethod exception ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 11_14 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
