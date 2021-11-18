<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<style>
aside {
	float: left;
	width: 200;
}
nav ul {
 	list-style: none;
}
</style>
<aside>
		<div>
			<span>MY PAGE</span>
			<h2>마이페이지</h2>
		</div>
		<nav>
			<p>나의 정보 관리</p>
			<ul>
				<c:choose>
					<c:when test="${sessionScope.id eq 'ADMIN@CARE.COM'}">
						<li><a href="/homin/mypage/info/manage">회원 정보 관리</a></li>
					</c:when>
					<c:otherwise>
						<li><a href="/homin/mypage/info/mgmt?id=${sessionScope.id }">회원 정보 관리</a></li>
					</c:otherwise>
				</c:choose>
				<li><a href="">주소지 관리</a></li>
				<li><a href="">간편결제 설정</a></li>
			</ul>
		</nav>
</aside>