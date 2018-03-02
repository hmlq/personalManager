<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
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
		通讯录<br>
		<form action="query" method="post">
			姓名:<input type="text" name="name"> 
			<input type="hidden" value="${userId}" name="userId"/>
			    <input type="submit" value="查询">
		</form>
		<table border="1" width="90%">
			<tr>
				<th width="10%" align="center">姓名</th>
				<th width="10%" align="center">电话</th>
				<th width="15%" align="center">Email</th>
				<th width="18%" align="center">工作地址</th>
				<th width="18%" align="center">家庭住址</th>
				<th width="13%" align="center">QQ</th>
				<th width="13%" align="center" colspan="2">编辑</th>
			</tr>
			
			<s:iterator value="list">
				<tr>
        	  		<td><s:property value="name" /></td>
					<td><s:property value="phone" /></td>
					<td><s:property value="email" /></td>
					<td><s:property value="workplace" /></td>
					<td><s:property value="place" /></td>
					<td><s:property value="qq" /></td>
					<td width="6.5%" align="center"><a href="">删除</a></td>
        	  		<td width="6.5%" align="center"><a href="">修改</a></td>
				</tr>
			</s:iterator>
		</table>
	</center>
</body>
</html>
