<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'updateUserPass.jsp' starting page</title>
    
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
		<h2>请修改账号密码:</h2>
		<form action="updatePersonalMessage1">
			<table border=0>
				<tr>
					<td align="right"><input type="hidden" value="${user.id}" name="user1.id">账号：</td>
					<td align="left"><input type="text" value="${user.userName }" name="user1.userName">
					</td>
				</tr>

				<tr>
					<td align="right">密码：</td>
					<td align="left"><input type="text" value="${user.password }" name="user1.password">
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
