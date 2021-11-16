<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<style type="text/css">
<!--
a:link{color:black;font-family:sans-serif;text-decoration:none;}
a:visited{color:black;font-family:sans-serif;text-decoration:none;}
a:hover{color:#cc3300; font-weight:bold; }
a:active{color:#ff00cc; text-decoration:underline; }
-->
#login {
	text-align: right;
}

#nav_left ul li {
	float: left;
	margin-right: 15; 
}

#nav_right { 
 	float: right;
}

nav ul {
	list-style: none;
}
#nav_right ul li {
	float: left;
	margin: 0 10 10 15;
}
hr {
	clear: both;
}

</style>

<div id="top">
	<div id="login">
		<c:choose>
			<c:when test="${not empty sessionScope.id}">
				<a href="/homin/mypage?id=${sessionScope.id }">${sessionScope.id }님의 마이 | </a>
				<a href="/homin/logout">로그아웃</a>
			</c:when>
			<c:otherwise>
				<a href="/homin/login">로그인</a>
			</c:otherwise>
		</c:choose>
		<a href="/homin/board">고객센터</a>
	</div>
	<div id="logo">
		<a href="/homin/index?formpath=home"> <h1>Hom'in</h1> </a>
	</div>
	
	<nav id="nav_left">
		<ul>
			<li> <a href="">정수기</a> </li>
			<li> <a href="">공기청정기</a> </li>
		</ul>
	</nav>
	
	<nav id="nav_right">
		<ul>
			<li> <a href="">장바구니</a> </li>
			<li> <a href="">일정</a> </li>
		</ul>
	</nav>
	<hr/>
</div>

