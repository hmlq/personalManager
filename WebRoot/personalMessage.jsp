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
	<h3><a href="userAction2.action">修改个人信息</a></h3>
	-->
</head>

<body>
		
<center>
	 <!-- <h3><a href="userAction2.action">修改个人信息</a></h3> -->
	 修改：<select>
			<option onclick="window.location='userAction2.action'">修改基本信息</option>
			<option onclick="window.location='userAction3.action'">修改账号密码</option>
		</select>
	<h4><a href="userAction4.action">返回</a></h4>
		<h2>个人信息如下:</h2>
		<table border=0>
			<tr>
				<td align="right"><input type="hidden" value="${user.id}" name="user.id">账号：</td>
				<td align="left"><input type="text" value="${user.userName }">
				</td>
			</tr>

			<tr>
				<td align="right">密码：</td>
				<td align="left"><input type="text" value="${user.password }">
				</td>
			</tr>

			<tr>
				<td align="right">真实姓名：</td>
				<td align="left"><input type="text" value="${user.name }">
			</tr>

			<tr>
				<td align="right">性别：</td>
				<td align="left"><input type="text" value="${user.sex }"></td>
			</tr>

			<tr>
				<td align="right">出生日期：</td>
				<td align="left"><input type="text" value="${user.birth }">
				</td>
			</tr>

			<tr>
				<td align="right">民族：</td>
				<td align="left"><input type="text" value="${user.nation }">
				</td>
			</tr>

			<tr>
				<td align="right">学历：</td>
				<td align="left"><input type="text" value="${user.edu }">
				</td>
			</tr>

			<tr>
				<td align="right">职称：</td>
				<td align="left"><input type="text" value="${user.work }">
				</td>
			</tr>

			<tr>
				<td align="right">手机：</td>
				<td align="left"><input type="text" value="${user.phone }">
				</td>
			</tr>

			<tr>
				<td align="right">地址：</td>
				<td align="left"><input type="text" value="${user.place }">
				</td>
			</tr>

			<tr>
				<td align="right">邮箱：</td>
				<td align="left"><input type="text" value="${user.email }">
				</td>
			</tr>
		</table>
		
	</center>
</body>
</html>
