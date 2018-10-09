<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>变更社区代理挂靠</title>
<style>
	.group-box div{
		margin-top:10px;
	}
	.group-box div label{
		width:200px;
	}
</style>
</head>
<body>
    <table border="1">
        <thead><tr><th>微信openId</th></tr></thead>
        <c:forEach items="${list}" var="obj">
            <tr><td>${obj.wxOpenId}</td></tr>
        </c:forEach>
    </table>
</body>
</html>