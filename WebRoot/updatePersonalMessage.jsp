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

<body>
	<center>
		<h2>请修改基本个人信息:</h2>
		<form action="updatePersonalMessage">
		<input type="hidden" value="${user.id}" name="user1.id">
			<table border=0>
				<tr>
					<td align="right">真实姓名：</td>
					<td align="left"><input type="text" value="${user.name }" name="user1.name">
				</tr>

				<tr>
					<td align="right">性别：</td>
					<td align="left"><input type="text" value="${user.sex }"name="user1.sex">
					</td>
				</tr>

				<tr>
					<td align="right">出生日期：</td>
					<td align="left"><input type="text" value="${user.birth }" name="user1.birth">
					</td>
				</tr>

				<tr>
					<td align="right">民族：</td>
					<td align="left"><input type="text" value="${user.nation }" name="user1.nation">
					</td>
				</tr>

				<tr>
					<td align="right">学历：</td>
					<td align="left"><input type="text" value="${user.edu }" name="user1.edu">
					</td>
				</tr>

				<tr>
					<td align="right">职称：</td>
					<td align="left"><input type="text" value="${user.work }" name="user1.work">
					</td>
				</tr>

				<tr>
					<td align="right">手机：</td>
					<td align="left"><input type="text" value="${user.phone }" name="user1.phone">
					</td>
				</tr>

				<tr>
					<td align="right">地址：</td>
					<td align="left"><input type="text" value="${user.place}" name="user1.place">
					</td>
				</tr>

				<tr>
					<td align="right">邮箱：</td>
					<td align="left"><input type="text" value="${user.email}" name="user1.email">
					</td>
				</tr>

				<tr>
					<td>&nbsp;</td>
					<td align="left"><input type="submit" value="提交"> <input
						type="reset" value="重置">
					</td>
				</tr>

			</table>
		</form>
	</center>
</body>
</html>
