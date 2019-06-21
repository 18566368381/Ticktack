<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>滴答办公系统-登录</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <!-- load css -->
    <link rel="stylesheet" type="text/css" href="media/layui/css/layui.css"
          media="all">
    <link rel="stylesheet" type="text/css" href="media/css/login.css"
          media="all">
    <link rel="stylesheet" type="text/css" href="media/css/verify.css">
    <script type="text/javascript" src="media/js/jquery.min.js"></script>

</head>
<body class="layui-bg-black">
<div class="layui-canvs"></div>
<div class="layui-layout layui-layout-login">
    <form action="login.do" method="post" onsubmit="return false">
        <h1>
            <strong>滴答办公系统登录</strong> <em>Tick-tock Office System</em>
        </h1>
        <div class="layui-user-icon larry-login">
            <input type="text" placeholder="账号" class="login_txtbx" name="no" id="no"
                   value="admin" />
        </div>
        <div class="layui-pwd-icon larry-login">
            <input type="password" placeholder="密码" id="password" name="password" value="admin"
                   class="login_txtbx" />
        </div>
        <%--<input type="hidden" name="ip" id="ip1"> <input type="hidden"
                                                        name="city" id="cy1">--%>
        <div class="feri-code">
            <div id="mpanel4"></div>
        </div>
        <div class="layui-submit larry-login">
            <input type="submit" id="btn1" value="立即登陆"
                   class="submit_btn" />
        </div>
    </form>
    <div class="layui-login-text">
        <p>© 2016-2018 北京滴答科技有限公司 Feri 版权所有</p>
    </div>
</div>
<script type="text/javascript" src="media/js/login.js"></script>
<script type="application/javascript" src="media/js/verify.min.js"></script>
<script type="text/javascript">
 /*   $(function() {
        //滑动验证码
        $('#mpanel4').pointsVerify({
            defaultNum : 6, //默认的文字数量
            checkNum : 1, //校对的文字数量
            vSpace : 5, //间隔
            imgName : [ '1.jpg', '2.jpg' ],
            imgSize : {
                width : '400px',
                height : '200px',
            },
            barSize : {
                width : '400px',
                height : '40px',
            },
            ready : function() {
            },
            success : function() {
                //......后续操作
                $("#btn1").attr("disabled", false);


            },
            error : function() {
            }
        });
    })*/
   $("form").submit(function () {
        $.ajax({
            type:"get",
            url:"login.do",
            dataType:"json",
            data:$("form").serialize(),
            success:function (data) {
                if (data.code==1){
                    window.location.href="index.jsp";
                }else{
                    alert(data.info);
                }
            }
        })
    })
</script>
</body>
</html>