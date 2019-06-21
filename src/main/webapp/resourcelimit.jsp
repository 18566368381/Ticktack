<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html xmlns:display="http://www.w3.org/1999/xhtml">
<head>
<meta charset="utf-8">
<title>滴答办公系统-权限管理</title>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="stylesheet" href="media/layui/css/layui.css" media="all">
	<link rel="stylesheet" href="media/css/font-awesome.min.css">
<script src="media/js/jquery.min.js"></script>
</head>
<body>
	<div class="layui-container">
		<div class="layui-btn-group">
			<button class="layui-btn layui-btn-norma" onclick="addAuth()">
				<i class="layui-icon">&#xe654;</i>添加权限
			</button>

		</div>
		<table class="layui-table" id="tbdata" lay-filter="tbop">
			<thead>
			<tr>
				<td>序号</td>
				<td>权限名</td>
				<td>权限简称</td>
				<td>页面类型</td>
				<td>父类页面id</td>
				<td>操作</td>
			</tr>
			</thead>
			<tbody id="tid">
			<tr>
				<td>序号</td>
				<td>权限名</td>
				<td>页面简称</td>
				<td>页面类型</td>
				<td>父类页面id</td>
				<td><input type="button" value="编辑" /><input type="button" value="删除" /></td>
			</tr>
			</tbody>
		</table>
		<script type="text/html" id="barop">
    		<a class="layui-btn layui-btn-mini" lay-event="edit">编辑</a>
    		<a class="layui-btn layui-btn-danger layui-btn-mini" lay-event="del">删除</a>
		</script>
	</div>
	<script src="media/layui/layui.js"></script>
	<!-- 注意：如果你直接复制所有代码到本地，上述js路径需要改成你本地的 -->
	<script>
    $(function () {
		loadData()
	})
	function loadData() {
		$.ajax({
			type:"get",
			url:"authoritylist.do",
			dataType:"json",
			success:function (data) {
				if(data.code==1){
					$("#tid").empty()
					var infos = data.info;
					for(var i=0;i<infos.length;i++) {
						var html = '<tr> ' +
								'<td>' + infos[i].id + '</td> ' +
								'<td>' + infos[i].pname + '</td> ' +
								'<td>' + infos[i].pdesc + '</td> ' +
								'<td>' + infos[i].ptype + '</td> '
						if (infos[i].parentid == null) {
							html += '<td>0</td>'
						}
						if (infos[i].parentid != null) {
							html += '<td>' + infos[i].parentid + '</td> '
						}

						html += '<td><input type="button" onclick="edit('+infos[i].id+')" value="编辑" /><input type="button" onclick="del('+infos[i].id+')" value="删除" /></td> ' +
								'</tr>'
						$("#tid").append($(html));
					}


				}else{
					alert(data.info);
				}
			}
		})
	}
	function edit(id) {
		window.location.href="courseupdate.jsp?id="+id
	}
	function del(id) {
		if(confirm("确认删除id为"+id+"的数据吗？")){
			$.ajax({
				type:"get",
				url:"delauthority.do",
				dataType:"json",
				data:{id:id},
				success:function (data) {
					if(data.code==1){
						alert("删除成功")
					}else{
						alert(data.info)
					}
				}
			})
		}

	}

	function addAuth() {
        layer.open({
            area: ['500px', '380px'],
            title: '权限页面新增',
            type: 1,
            content:  $('#dvlay'), //这里content是一个普通的String
            btn: ['新增', '取消'],
            yes: function(index, layero){
                $.ajax({
                    url: "authorityadd.do",
					method:"post",
                    data: $("#fm1").serialize(),
                    success: function (data) {
                        if (obj.code == 1) {
                            layer.msg("新增权限成功");
                            loadData();
                        } else {
                            layer.msg("新增权限失败");
                        }
                    }
                })
                layer.close(index);
            },cancel: function(){
            }
        });
    }
    function changePid(i) {
		if(i==-1){
            $.get("authorityroot.do",null,function (arr) {
				for(i=0;i<arr.length;i++){
                    $("#spid").append("<option value=\""+arr[i].id+"\">"+arr[i].title+"</option>");
				}
            $("#dvl1").css("display","block");
            form.render();
            });
		}else{
            $("#dvl1").css("display","none");
		    $("#pid").val(i);
		}
    }
    function setPid(obj) {
        $("#pid").val(obj.value());
    }
</script>
</body>
<div style="display: none;margin-top: 10px;width: 480px" id="dvlay">
	<form id="fm1" class="layui-form " >
		<div class="layui-form-item"  >
			<label class="layui-form-label">权限名：</label>
			<div class="layui-input-inline">
				<input name="pname" class="layui-input">
			</div>
		</div>
		<div class="layui-form-item"  >
			<label class="layui-form-label">权限简称：</label>
			<div class="layui-input-inline">
				<input name="pdesc" class="layui-input">
			</div>
		</div>

		<div class="layui-form-item" >
			<label class="layui-form-label">页面类型：</label>
			<div class="layui-input-inline">
				<input type="radio" name="ptype" value="1" lay-filter="level"  title="一级" checked>
				<input type="radio" name="ptype" value="2" lay-filter="level"   title="二级" >
			</div>
		</div>
		<input type="hidden" name="parentId" id="pid">
		<div class="layui-form-item" id="dvl1" style="display: none" >
			<label class="layui-form-label">父类页面id：</label>
			<div class="layui-input-inline">
				<select onselect="setPid(this)" id="spid" >

				</select>

			</div>
		</div>
	</form>
</div>
</html>