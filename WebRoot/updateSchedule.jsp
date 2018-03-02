<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updateSchedule.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <center>
    	<h2>请修改日程</h2>
    	<form action="updateSchedule2" method="post">
    	<table>
	    	<tr>
	    		<td>日期:</td>
	    		<td><input type="text" name="schedule.date" value="${schedule.date }">
	    		<input type="hidden" name="schedule.userId" value=<%=request.getParameter("userId")%>>
	    		<input type="hidden" name="schedule.id" value="${schedule.id }">
	    		</td>
	    	</tr>
	    	<tr>
	    		<td>日程:</td>
	    		<td><textarea rows="10" cols="18" name="schedule.thing">${schedule.thing }</textarea></td>
	    	</tr>
	    	<tr>
	    		<td>&nbsp;</td>
	    		<td>
	    			<input type="submit" value="修改">
	    			<input type="reset" value="重置">
	    		</td>
	    	</tr>  
    	</table>
    	</form>
    </center>
  </body>
</html>
