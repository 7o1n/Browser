<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="myBean" class="ch11_el.LoginBean2"/>
<jsp:setProperty name="myBean" property="*"/>  
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
EL(Parameter)형식:: ${param.id }<br>
EL(Attribute)형식:: ${myBean.id}<br>
EL(Parameter)형식:: ${param.passwd} <br>
EL(Attribute)형식:: ${myBean.passwd} <br>
<hr>당신이 입력한 정보입니다(고전적인 방식).<hr>
아이디 : <jsp:getProperty property="id" name="myBean"/><br>
비밀번호 : <jsp:getProperty property="passwd" name="myBean"/>
<hr>당신이 입력한 정보입니다(EL 방식).<hr>
아이디 : ${myBean.id }<br>
비밀번호: ${myBean.passwd} <br>
</body>
</html>