<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat21_3" scope="request" class="excat.test.TestCase21_3" />

<jsp:setProperty name="cat21_3" property="*" />
<%
	cat21_3.setConfigAndRunCase("test deleteObjectElement ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case ‚Q1_3 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
