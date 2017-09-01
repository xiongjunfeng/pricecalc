<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en" class="no-js">
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge"> 
<meta name="viewport" content="width=device-width, initial-scale=1"> 
<title>login</title>
<link rel="stylesheet" type="text/css" href="css/normalize.css" />
<link rel="stylesheet" type="text/css" href="css/demo.css" />
<!--必要样式-->
<link rel="stylesheet" type="text/css" href="css/component.css" />
<!--[if IE]>
<script src="js/html5.js"></script>
<![endif]-->
</head>
<body>
		<div class="container demo-1">
			<div class="content">
				<div id="large-header" class="large-header">
					<canvas id="demo-canvas"></canvas>
					<div class="logo_box">
						<h3>中国电信云管平台</h3>
						<form  name="f">
							<div class="input_outer">
								<span class="u_user"></span>
								<input name="logname" id="username" class="text" style="color: #FFFFFF !important" type="text" placeholder="请输入账户">
							</div>
							<div class="input_outer">
								<span class="us_uer"></span>
								<input name="logpass" id="password" class="text" style="color: #FFFFFF !important; position:absolute; z-index:100;"value="" type="password" placeholder="请输入密码">
							</div>
							<div class="mb2"><a class="act-but submit"  style="color: #FFFFFF" onclick="subclick()">登录</a></div>
						</form>
					</div>
				</div>
			</div>
		</div><!-- /container -->
		<script src="js/TweenLite.min.js"></script>
		<script src="js/EasePack.min.js"></script>
		<script src="js/rAF.js"></script>
		<script src="js/demo-1.js"></script>
		<div style="text-align:center;">
</div>
<script src="js/jquery-2.1.4.min.js"></script>
    
<script language="javaScript">

function subclick() {
	  console.log(GetJsonData());
    $.ajax({
        type: "POST",
        url: "/login",
        data: JSON.stringify(GetJsonData()),
        dataType: "json",
        contentType: "application/json",
        success: function (res) {
        	console.log(res)
            if (res.code == 200) {
                //alert("提交成功，准备跳转");
                document.location.href='subscribe.jsp';
            }
            else{
            	alert("账号名密码不符");
         		$("#request-process-patent").html("账号名密码不符！");
            }
        },
        error: function (message) {
        	alert("failed");
         	$("#request-process-patent").html("提交数据失败！");
        }
    });
  };

    function GetJsonData() {  
    var json = {  
        "name": $("#username").val(),  
        "password": $("#password").val()
    };  
    return json;  	
  };
  
</script>
	</body>
</html>