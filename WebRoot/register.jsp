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
    <form action="register.action" method="post">
    <h2>请注册：</h2>
    <table border=0>
   		<tr>
   		<td align="right">账号：</td>
   		<td align="left"><input type="text" name="user.userName"></td>
   		</tr>
   		
   		<tr>
   		<td align="right">密码：</td>
   		<td align="left"><input type="password" name="user.password"></td>
   		</tr>
   		
   		<tr>
   		<td align="right">真实姓名：</td>
   		<td align="left"><input type="text" name="user.name"></tr>
   		
   		<tr>
   		<td align="right">性别：</td>
   		<td align="left">
   			<input type="radio" name="user.sex" value="男">男
   		    <input type="radio" name="user.sex" value="女">女</td>
   		</tr>
   		
   		<tr> 
   		<td align="right">出生日期：</td>
   		<td  align="left"><input type="text" name="user.birth"></td>
   		</tr>
   		
   		<tr>
   		<td align="right">民族：</td>
   		<td align="left"><input type="text" name="user.nation"></td>
   		</tr>
   		
   		<tr>
   		<td align="right">学历：</td>
   		<td align="left"><input type="text" name="user.edu"></td>
   		</tr>
   		
   		<tr>
   		<td align="right">职称：</td>
   		<td align="left"><input type="text" name="user.work"></td>
   		</tr>
   		
   		<tr>
   		<td align="right">手机：</td>
   		<td align="left"><input type="text" name="user.phone"></td>
   		</tr>
   		
   		<tr>
   		<td align="right">地址：</td>
   		<td align="left"><input type="text" name="user.place"></td>
   		</tr>

   		<tr>
   		<td align="right">邮箱：</td>
   		<td align="left"><input type="text" name="user.email"></td>
   		</tr>
   		
   		<tr>
   		<td>&nbsp;</td>
   			<td align="left">
   			<input type="submit" value="提交">
        	<input type="reset" value="重置" >
        	</td>
        </tr>
    </table>
    </form>
    </center>
</body>
</html>
