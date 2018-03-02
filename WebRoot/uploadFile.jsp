<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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

<title>My JSP 'uploadFile.jsp' starting page</title>

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
		<form action="upload" method="post" enctype="multipart/form-data">
			请选择上传文件:<input type="file" name="upload"><br> <br>
			<input type="submit" value="上传">
		</form>
	</center>

	<%--  <s:form action="uploadFile" method="post" enctype="multipart/form-data">
    	<s:file name="upload" label="请选择上传文件"></s:file>
    	<s:submit value="上传"></s:submit>
    </s:form>
    <s:if test="upload!=null">
    	上传信息:<br>
    	文件名称:<s:property value="uploadFileName"/><br>
    	文件类型:<s:property value="uploadContentType"/>
    </s:if> --%>
</body>
</html>
