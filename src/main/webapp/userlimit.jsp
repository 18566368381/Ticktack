<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page pageEncoding="utf-8" isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>滴答办公系统-用户角色</title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport"
          content="width=device-width, initial-scale=1, maximum-scale=1">
    <link rel="stylesheet" href="media/layui/css/layui.css" media="all">
    <script src="media/js/jquery.min.js"></script>
</head>
<body>

<form onsubmit="return false" id="myform">
    <div class="layui-container">
        <div class="layui-row" style="margin-top: 10px">
            <div class="layui-col-xs3" style="margin-right: 20px">
                <div class="layui-form-item layui-form-text">
                    <label class="layui-form-label">工号/名称：</label>
                    <div class="layui-input-block">
                        <input type="text" id="no" name="no" class="layui-input" placeholder="工号/名称">
                    </div>
                </div>
            </div>
            <div class="layui-col-xs3" style="margin-right: 20px">
                <div class="layui-form-item layui-form-text">
                    <label class="layui-form-label">用户：</label>
                    <div class="layui-input-block">
                        <select class="layui-input" name="flag" id="fg">
                            <option value="1">有效</option>
                            <option value="2">无效</option>
                        </select>
                    </div>
                </div>
            </div>
            <div class="layui-col-xs2">
                <div class="layui-form-item">
                    <div class="layui-input-block">
                        <button class="layui-btn" type="submit"><i class="layui-icon layui-icon-search">搜索</i>
                        </button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</form>

<div class="layui-row">
    <div class="layui-col-md11">
        <table class="layui-table" id="tbdata" lay-filter="tbop">
            <thead>
            <tr>
                <td>序号</td>
                <td>工号</td>
                <td>姓名</td>
                <td>职位</td>
                <td>有/无效</td>
                <td>操作</td>
            </tr>
            </thead>
            <tbody id="tbody">

            </tbody>
        </table>

    </div>
</div>

</div>
<script src="media/layui/layui.js"></script>
<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
<script>
    $(function () {
        $.ajax({
            type:"post",
            url:"userlist.do",
            dataType:"json",
            success:function(data){
                if(data.code==1){
                    $("#tbody").empty();
                    var users = data.info;
                    for(var i = 0; i<users.length;i++){
                        var html = '<tr>' +
                                '<td>' + users[i].id + '</td> ' +
                                '<td>' + users[i].no + '</td> ' +
                                '<td>' + users[i].name + '</td> '
                        if (users[i].role==1){
                            html += '<td>学员</td>'
                        }
                        if(users[i].role==2){
                            html += '<td>员工</td>'
                        }
                        if(users[i].role==3){
                            html += '<td>管理员</td>'
                        }
                        if(users[i].flag==1){
                            html += '<td>有效</td>'
                        }
                        if(users[i].flag==2){
                            html += '<td>无效</td>'
                        }

                            html += '<td><input type="button" onclick="del(' + users[i].no + ')" value="删除"> </td>' +
                                '</tr>'
                        $("#tbody").append($(html))
                    };

                }else{
                    alert(data.info);
                }
            }
        })
    })
    function del(no) {
        if(confirm("确定删除账户为"+no+"的用户吗？")){
            $.ajax({
                type:"get",
                url:"deleteUser.do?no="+no,
                dataType:"json",
                success:function(data){
                    if (data.code==1){
                        alert(data.info);

                    }else{
                        alert(data.info);
                    }
                }
            })
        }

    }
    $("#myform").submit(function () {
        $.ajax({
            type:"post",
            url:"selectUser.do",
            dataType:"json",
            data:{no:$("#no").val(),flag:$("#fg").val()},
            success:function (data) {
                if(data.code==1){
                    $("#tbody").empty();
                    var users = data.info;
                    for(var i = 0; i<users.length;i++){
                        var html = '<tr>' +
                                '<td>' + users[i].id + '</td> ' +
                                '<td>' + users[i].no + '</td> ' +
                                '<td>' + users[i].name + '</td> '
                        if (users[i].role==1){
                            html += '<td>学员</td>'
                        }
                        if(users[i].role==2){
                            html += '<td>员工</td>'
                        }
                        if(users[i].role==3){
                            html += '<td>管理员</td>'
                        }
                        if(users[i].flag==1){
                            html += '<td>有效</td>'
                        }
                        if(users[i].flag==2){
                            html += '<td>无效</td>'
                        }


                        html +=  '<td><input type="button" onclick="del(' + users[i].no + ')" value="删除"> </td>' +
                                '</tr>'
                        $("#tbody").append($(html))
                    };
                }else{
                    alert(data.info);
                }
            }
        })
    })

</script>

</body>
<div style="display: none;margin-top: 10px;width: 480px" id="dvlay">
    <form id="fm1" class="layui-form layui-form-pane" >
        <div class="layui-form-item" pane >
            <label class="layui-form-label">工号：</label>
            <div class="layui-input-inline">
                <input id="uid" name="id" readonly class="layui-input">
            </div>
        </div>
        <div class="layui-form-item" pane>
            <label class="layui-form-label">角色：</label>
            <div class="layui-input-inline" id="dv1">

            </div>
        </div>
    </form>
</div>
</html>