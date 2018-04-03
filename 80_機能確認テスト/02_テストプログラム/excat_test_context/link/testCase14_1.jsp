<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat14_1" scope="request" class="excat.test.TestCase14_1" />

<jsp:setProperty name="cat14_1" property="*" />
<%
	cat14_1.setConfigAndRunCase("test stackTraceDepth=-1 ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 14_1 ‚ğÀs‚µ‚Ü‚µ‚½B
</FONT>


</html>
