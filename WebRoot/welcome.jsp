<%@page import="pojo.User"%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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

<body><!--  onload="alert('登陆成功')" -->
	<center>个人信息管理平台</center>
	userId=${user.id }<br>
	userName=${user.userName }<br>
	<ul>
		<li><a href="userAction1">个人信息管理</a></li>
		
		
		<li><a href="addressListAction?userId=${user.id }">通讯录管理</a></li>
		<li><a href="scheduleAction?userId=${user.id }">日程安排管理</a></li>
		<li><a href="fileManager.jsp?userId=${user.id }">个人文件管理</a></li>
		<li><a href="index.jsp">退出主页面</a></li>
	</ul>
</body>
</html>
