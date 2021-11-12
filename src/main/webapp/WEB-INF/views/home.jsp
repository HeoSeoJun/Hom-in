<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<center>
	<table>
		<c:if test="${not empty msg }">
			<tr>
				<td align="center"><h3 style="color:red">${msg }</h3></td>
			</tr>
		</c:if>
		<tr>
			<td align="center">
				<h3>
					더 할 나위 없다.
				</h3>
			</td>
		</tr>
		<tr>
			<td align="right"> - 미생</td>
		</tr>
	</table>
</center>


