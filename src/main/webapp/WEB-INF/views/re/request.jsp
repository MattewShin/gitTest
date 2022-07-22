<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1> re/request.do 요청에 대한 뷰 페이지</h1>

<hr/>
아이디 : ${param.id} <br/> 
나이 : ${param.age} <br/>
이름 : ${param.name}
<hr/>

아이디 : ${memberVO.id} <br/> 
나이 : ${memberVO.age} <br/>
이름 : ${memberVO.name}
<hr/>

아이디 : ${vo.id} <br/> 
나이 : ${vo.age} <br/>
이름 : ${vo.name}

</body>
</html>