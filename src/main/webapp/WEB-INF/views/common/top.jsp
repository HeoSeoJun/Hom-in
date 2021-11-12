<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<style type="text/css">
<!--

a:link{color:black;font-family:sans-serif;text-decoration:none;}
a:visited{color:black;font-family:sans-serif;text-decoration:none;}
a:hover{color:#cc3300; font-weight:bold; }
a:active{color:#ff00cc; text-decoration:underline; }
-->
</style>

<table width=800>
	<tr><td align="center" colspan=5><h1>Hom'in</h1></td></tr>
	<tr align="right">
		<c:choose>
			<c:when test="${not empty sessionScope.id }">
				<td colspan="4">
					<a href="#">${sessionScope.id }님의 마이 | </a>
					<a href="/homin/logout">로그아웃</a>
				</td>
			</c:when>
			<c:otherwise>
				<td><a href="/homin/login">로그인</a></td>
			</c:otherwise>
		</c:choose>
		<td><a href="/homin/board">게시판</a></td>
	</tr>
	<tr align="right">
		<td width=500></td>
		<td><a href="/homin/index?formpath=home">홈</a></td>
		
		<td><a href="/homin/index?formpath=member">회원가입</a></td>
		<c:if test="${not empty sessionScope.id }">
			<td><a href="/homin/memberList?numPage=${pageConfig.getNumPage() }">회원목록</a></td>
		</c:if>
	</tr>
	<tr><td align="center" colspan=6><hr/></td></tr>
</table>

