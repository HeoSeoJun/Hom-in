<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<style>
table {
	width: 400; height: 200;
}
</style>
<div>
	<c:import url="mypage/mypageNav.jsp"></c:import>
		
	<div>
		<div>
			<h3>주소지 관리</h3>
		</div>
		<section>
			<table>
				<tr>
					<td>아이디</td><td>${postCode.id }</td>
				</tr>
				<tr>
					<td>우편번호</td><td>${postCode.zipcode }</td>
				</tr>
				<tr>
					<td>주소</td><td>${postCode.addr1 }</td>
				</tr>
				<tr>
					<td>상세주소</td><td>${postCode.addr2 }</td>
				</tr>
				<tr>
					<td colspan="2" align="right">
						<input type="button" value="수정">
						<input type="button" value="주소삭제" onclick="">
					</td>
				</tr>
				
			</table>
		</section>
	</div>
</div>