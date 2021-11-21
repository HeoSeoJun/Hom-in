<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<script>
	function deleteChk() {
				
	}
</script>
<c:if test="${not empty msg }">
	<script>
		alert("${msg }");
	</script>
</c:if>
<style>
table {
/* 	width: 400; height: 200; */
}
</style>
<div>
	<c:import url="mypage/mypageNav.jsp"></c:import>
		
	<div>
		<div>
			<h3>주소지 목록</h3>
		</div>
		<section>
			<form action="" id="f" method="post">
				<table>
					<thead>
						<tr>
							<td>선택</td><td>아이디</td><td>우편번호</td><td>주소</td><td>상세주소</td>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="pDto" items="${list }">
							<tr>
								<td><input type="checkbox" name="addr_chk" value="${pDto.id }"></td>
								<td>${pDto.id }</a></td>
								<td>${pDto.zipcode }</td>
								<td>${pDto.addr1 }</td>
								<td>${pDto.addr2 }</td>
							</tr>
						</c:forEach>
					</tbody>
					<tfoot>
						<tr>
							<td colspan="5" align="right">
								<input type="button" value="수정">
								<input type="button" value="삭제" onclick="deleteChk()">
							</td>
						</tr>
					</tfoot>
				</table>
			</form>
		</section>
	</div>
</div>
