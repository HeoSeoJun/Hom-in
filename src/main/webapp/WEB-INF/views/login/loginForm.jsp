<%@ page contentType="text/html; charset=UTF-8"%>

<center>
<div style="height: 70;">
	<a href="/homin"><img style="width: 150;" alt="" src="https://static.mylgid.com/userweb/1.0.28/images/logo_bi_SVC0000026.png"></a>
</div>
<hr>
<div style="height: 200">
    	<h1>
    		<img style="width: 300" src="https://static.mylgid.com/userweb/1.0.28/images/logo.svg" alt="MY LG ID" />
    	</h1>
	    <p id="testAlert">하나의 ID로 LG의 다양한 서비스를 이용해보세요.</p>
        <p>홈인 서비스는 MY LG ID로 이용하실 수 있습니다.</p>        
</div>
<form action="/homin/loginProc" method="post">
	<table>
		<tr>
			<td><label class="form-title">MY LG ID (이메일 또는 휴대폰 번호)</label></td>
		</tr>
		<tr>
			<td><input style="width: 350" type=text name='id' placeholder="MY LG ID (이메일 또는 휴대폰 번호)"/></td>
		</tr>
		<tr>
			<td>비밀번호</td>
		</tr>
		<tr>
			<td><input style="width: 350" type=password name='pw' placeholder="비밀번호"/></td>
		</tr>
		<tr>
			<td colspan=2 align='center'>
				<input type=submit value='로그인' style="width: 86px; "/>
				<input type=reset value='취소' style="width: 86px; "/> 
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
