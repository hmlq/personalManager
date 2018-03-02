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

<title>My JSP 'fileManager.jsp' starting page</title>

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
	<table>
		<tr>
			<td>文件路径:</td>
			<td><input type="text" name="path"></td>
		</tr>
		<tr>
			<td>文件名称:</td>
			<td><input type="text" name="name"></td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td align="right"><a href="">查看</a></td>
		</tr>
	</table>
		<a>添加文件</a> <a>修改文件</a> <a>删除文件</a> <a>下载文件</a> <a>上传文件</a>
	</center>
</body>
</html>
