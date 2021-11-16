<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<html>
<body>
	<div align="center">
		<table style="width:800px;">
			<tr>
				<td style="height:100px;"><%@ include file="common/top2.jsp" %></td>
			</tr>
			
			<tr>
				<td style="height:400px;">
				<c:choose>
					<c:when test="${not empty formpath }">
			<%-- 			<%@ include file="${formpath }.jsp" %>
							지시자(directive) 내 el태그 삽입 -> jstl 사용 --%>
						<c:import url="${formpath }.jsp"></c:import>
					</c:when>
					<c:otherwise>
						<c:import url="home.jsp"></c:import>
<%-- 						<%@ include file="home.jsp" %> --%>
					</c:otherwise>
				</c:choose>
				</td>
			</tr>
			
			<tr>
				<td style="height:50px;"><%@ include file="common/footer.jspf" %></td>
			</tr>
		</table>
	</div>
</body>
</html>