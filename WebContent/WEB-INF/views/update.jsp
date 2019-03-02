<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2 align="center" style="background-color: pink">修改顾客</h2>
	<form:form action="${pageContext.request.contextPath }/cust"
		method="post" modelAttribute="customer">
		<input type="hidden" name="_method" value="PUT" />
		<form:hidden path="id" />
		编号:<input type="text" name="id" />
		<br />
		姓名:<input type="text" name="name" />
		<br />
		性别:男:<input type="radio" name="gender" value="男" checked="checked" />
		           女:<input type="radio" name="gender" value="女" />
		<br />
		邮箱:<input type="text" name="email" />
		<br />
		年龄:<input type="text" name="age" />
		<br />
		所属部门:<input type="text" name="dept.id"/>
		<br />
		<input type="submit" value="修改">
	</form:form>


</body>
</html>