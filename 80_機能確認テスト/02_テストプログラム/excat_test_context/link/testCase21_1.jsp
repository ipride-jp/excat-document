<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat21_1" scope="request" class="excat.test.TestCase21_1" />

<jsp:setProperty name="cat21_1" property="*" />
<%
	//cat21_1.setConfigAndRunCase('a',123,true,'c',"object");
	cat21_1.setConfigAndRunCase("test 21_1 object");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 21_1 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
