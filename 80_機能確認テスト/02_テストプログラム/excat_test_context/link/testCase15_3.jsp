<%@page contentType="text/html; charset=shift_jis"%>

<html>

<jsp:useBean id="cat15_3" scope="request" class="excat.test.TestCase15_3" />

<jsp:setProperty name="cat15_3" property="*" />
<%
	cat15_3.setConfigAndRunCase("test attributeNestDepth=-1 ");
%>


<FONT size = 5 COLOR="gray">
<br>
test case 15_3 �����s���܂����B
</FONT>


</html>
