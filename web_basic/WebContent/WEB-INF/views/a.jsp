<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% pageContext.setAttribute("p","ㄱㄴㄷㄹ"); %>

	<h1>requsest.getAttribute("a") : ${a }</h1>
	<h1>requsest.getAttribute("b") : ${b }</h1>
	<h1>pageContext.getAttribute("p") : ${p }</h1>
	<h1>session.getAttribute("s") : ${s }</h1>
	
	<a href="b">/b 요청하기</a>
	<a href="c">/c 요청하기</a>
</body>
</html>