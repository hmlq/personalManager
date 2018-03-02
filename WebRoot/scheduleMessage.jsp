<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'scheduleMessage.jsp' starting page</title>
    
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
		日程管理<br>
		userName=${user.userName }
		<form action="scheduleQuery" method="post">
			姓名:<input type="text" name="name"> 
			<input type="hidden" value="${userId}" name="userId"/>
			    <input type="submit" value="查询">
		</form>
		
		
		<a href="insertSchedule.jsp?userId=${userId}">添加</a>
		<table border="1" width="80%">
			<tr>
				<th width="15%" align="center">日期</th>
				<th width="60%" align="center">日程</th>
				<th width="13%" align="center" colspan="2">编辑</th>
			</tr>
			
			<s:iterator value="list">
				<tr>
        	  		<td><s:property value="date" /></td>
					<td><s:property value="thing" /></td>
					<td width="6.5%" align="center"><a href="deleteSchedule?id=${id}&&userId=${userId }" onclick="return confirm('确认删除吗?')">删除</a></td>
        	  		<td width="6.5%" align="center"><a href="updateSchedule1?id=${id}&&userId=${userId}">修改</a></td>
				</tr>
			</s:iterator>
		</table>
	</center>
  </body>
</html>
