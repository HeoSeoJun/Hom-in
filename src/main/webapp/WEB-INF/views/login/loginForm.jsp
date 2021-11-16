<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:if test="${not empty sessionScope.id }">
	<script>
		location.href='/homin/';
	</script>
</c:if>
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
<script>
	function check() {
		id = document.getElementById('id').value;
		pw = document.getElementById('pw').value;
		
		if (id == ""){
			alert('아이디를 입력해주세요');
			return;			
		}
		if (pw == ""){
			alert('비밀번호를 입력해주세요');
			return;			
		}
		
		document.getElementById('f').submit();
	}
</script>

<center>
<div>
	<a href="/homin"><img style="width: 100;" alt="" src="https://static.mylgid.com/userweb/1.0.28/images/logo_bi_SVC0000026.png"></a>
</div>
<hr>
<div>
    	<h1>
    		<img style="width: 150" src="https://static.mylgid.com/userweb/1.0.28/images/logo.svg" alt="MY LG ID" />
    	</h1>
	    <p id="testAlert">하나의 ID로 LG의 다양한 서비스를 이용해보세요.</p>
        <p>홈인 서비스는 MY LG ID로 이용하실 수 있습니다.</p>        
</div>
<form action="/homin/loginProc" id="f" method="post">
	<table>
		<tr>
			<td><label class="form-title">MY LG ID (이메일)</label></td>
		</tr>
		<tr>
			<td><input style="width: 350" type=text id="id" name='id' placeholder="MY LG ID (이메일)"/></td>
		</tr>
		<tr>
			<td>비밀번호</td>
		</tr>
		<tr>
			<td><input style="width: 350" type=password id="pw" name='pw' placeholder="비밀번호"/></td>
		</tr>
		<tr>
			<td colspan=2 align='center'>
				<input type="button" value='로그인' style="width: 86px;" onclick="check()"/>
				<input type=reset value='취소' style="width: 86px; "/> 
			</td>
		</tr>
		<c:set var="redirectUri" value="http://localhost:8085/homin/kakaoLogin"/>
		<c:set var="restKey" value="6b699a51ed025c4bd6a42e5026901e43"/>
		<tr>
			<td colspan="2" align="center">
				<a href="https://kauth.kakao.com/oauth/authorize?client_id=${restKey }&redirect_uri=${redirectUri }&response_type=code"> 
					<img src="//k.kakaocdn.net/14/dn/btqCn0WEmI3/nijroPfbpCa4at5EIsjyf0/o.jpg" width="180"/>
				</a>
			</td>
		</tr>
		<tr>
			<td colspan=2 align='center'>
				<a href="">회원가입</a> |
				<a href="">아이디 찾기</a> |
				<a href="">비밀번호 찾기</a>
			</td>
		</tr>
	</table>
</form>
</h3>
</center>
