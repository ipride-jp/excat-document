<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat" scope="request" class="excat.test.TestCaseShift" />

<jsp:setProperty name="cat" property="*" />
<%
	String cno = request.getParameter("cno");
	
	cat.runCase(cno);
%>


<FONT size = 5 COLOR="gray">
<br>
test case file shift ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
