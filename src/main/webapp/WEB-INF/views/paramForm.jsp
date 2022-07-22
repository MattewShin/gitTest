<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>paramForm.do 뷰 페이지</h1>

아이디 : ${memberVO.id} </br>
이름 : ${memberVO.name} </br>
나이 : ${memberVO.age}  </br>

${sessionScope.login} 님은 접속중 
</body>
</html>