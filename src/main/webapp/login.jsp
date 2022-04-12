<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">

	<title>吃豆人| Log in</title>

	<meta content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no" name="viewport">

	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/font-awesome/css/font-awesome.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/ionicons/css/ionicons.min.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/adminLTE/css/AdminLTE.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/iCheck/square/blue.css">
</head>

<body class="hold-transition login-page">
	<div class="login-box">
		<div class="login-logo">
			<a href="all-admin-index.html"><b>游戏登陆</b>登陆</a>
		</div>
		<!-- /.login-logo -->
		<div class="login-box-body">
			<p class="login-box-msg">登录</p>

			<form action="${root}/login" method="post">
				<div class="form-group has-feedback">
					<input type="text" name="uName" class="form-control" placeholder="用户名"> <span
						class="glyphicon glyphicon-envelope form-control-feedback"></span>
				</div>

				<div class="form-group has-feedback">
					<input type="password" name="uPassword" class="form-control" placeholder="密码"> <span
						class="glyphicon glyphicon-lock form-control-feedback"></span>
				</div>
				<img src="${root}/checkCode" alt="" id="img" onclick="getChangeCode()">
				<div class="form-group has-feedback">
					<input type="text" name="code" class="form-control" placeholder="验证码"> <span
						class="glyphicon glyphicon-lock form-control-feedback"></span>
					<span style="color: red">${message}</span>
				</div>
				<div class="form-group has-feedback">
					选择难度<br>
					难<input type="radio" name="chose" class="form-control" value="0"> <span
						class="glyphicon glyphicon-envelope form-control-feedback"></span>
					中<input type="radio" name="chose" class="form-control"value="1"> <span
						class="glyphicon glyphicon-envelope form-control-feedback" ></span>
					易<input type="radio" name="chose" class="form-control" value="2"> <span
						class="glyphicon glyphicon-envelope form-control-feedback"></span>
                    选择皮肤<br>
                    红色<input type="radio" name="color" class="form-control" value="hong"> <span
                        class="glyphicon glyphicon-envelope form-control-feedback"></span>
                    紫色<input type="radio" name="color" class="form-control"value="zi"> <span
                        class="glyphicon glyphicon-envelope form-control-feedback" ></span>
                    黄色<input type="radio" name="color" class="form-control" value="huang"> <span
                        class="glyphicon glyphicon-envelope form-control-feedback"></span>

				</div>
				<div class="row">
					<div class="col-xs-8">
						<div class="checkbox icheck">
<%--							<label><input type="checkbox"> 记住 下次自动登录</label>--%>
						</div>
					</div>
					<!-- /.col -->
					<div class="col-xs-4">
						<button type="submit" class="btn btn-primary btn-block btn-flat">登录</button>
					</div>
					<!-- /.col -->
				</div>
			</form>

			<a href="zhuce.jsp">注册</a><br>


		</div>
		<!-- /.login-box-body -->
	</div>
	<!-- /.login-box -->

	<!-- jQuery 2.2.3 -->
	<!-- Bootstrap 3.3.6 -->
	<!-- iCheck -->
	<script src="${pageContext.request.contextPath}/plugins/jQuery/jquery-2.2.3.min.js"></script>
	<script src="${pageContext.request.contextPath}/plugins/bootstrap/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/plugins/iCheck/icheck.min.js"></script>
	<script>
		function getChangeCode(){
			//一点击验证码就改变src的值  加上时间戳
			$("#img").attr("src","${root}/checkCode?date="+new Date());

		}
		$(function () {
			$('input').iCheck({
				checkboxClass: 'icheckbox_square-blue',
				radioClass: 'iradio_square-blue',
				increaseArea: '20%' // optional
			});
		});
	</script>
</body>

</html>