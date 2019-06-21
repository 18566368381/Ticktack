<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib  uri="http://shiro.apache.org/tags" prefix="shiro" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>滴答办公系统-主页</title>
    <link rel="stylesheet" href="media/layui/css/layui.css" media="all">
    <!-- <link rel="stylesheet" type="text/css" href="http://www.jq22.com/jquery/font-awesome.4.6.0.css"> -->
    <link rel="stylesheet" href="media/css/app.css" media="all">
    <link rel="stylesheet" href="media/css/font-awesome.min.css">
    <style type="text/css">
        iframe{
            width: 98%;
            height: 98%;
        }
        .layui-tab-item{
            height: 98%;
        }
    </style>
</head>

<body>
<div class="layui-layout layui-layout-admin kit-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">
            <img src="media/images/qf_logo.png" style="margin-right: 10px" /><span
                style="font-size: 22px">滴答办公系统</span>
        </div>

        <!-- 头部区域（可配合layui已有的水平导航） -->
        <ul class="layui-nav layui-layout-left">
            <li class="layui-nav-item kit-side-fold" lay-unselect >
                <a href="javascript:flexible();" title="侧边伸缩">
                    <i class="layui-icon layui-icon-shrink-right" id="LAY_flexible"></i>
                </a>

            </li>
            <li class="layui-nav-item" lay-unselect>
                <a href="index.jsp" layadmin-event="refresh" title="刷新">
                    <i class="layui-icon layui-icon-refresh-3"></i>
                </a>
            </li>
            <li class="layui-nav-item layui-hide-xs" lay-unselect>
                <input type="text" placeholder="搜索..." autocomplete="off" class="layui-input layui-input-search" layadmin-event="serach" lay-action="template/search.html?keywords=">
            </li>

        </ul>
        <ul class="layui-nav layui-layout-right">
            <li class="layui-nav-item" style="margin-right: 20px">
                <a href="javascript:showTab(1001,'processlist.html','待办事项');">待办事项<span class="layui-badge">99+</span></a>
            </li>
            <li class="layui-nav-item">
                <a href="javascript:;">
                    <img src="media/images/qf_logo.png" class="layui-nav-img">
                    <shiro:principal></shiro:principal>
                </a>
                <dl class="layui-nav-child">
                    <dd><a href="javascript:showTab(1001,'user.html','我的信息');">我的信息</a></dd>
                    <dd><a href="javascript:showTab(1001,'user.html','更改头像');">更改头像</a></dd>
                    <dd><a href="javascript:showTab(1002,'user.html','修改密码');">修改密码</a></dd>
                </dl>
            </li>
            <li class="layui-nav-item"><a href="userloginout.do">注销</a></li>
        </ul>
    </div>

    <div class="layui-side layui-bg-black ">
        <div class="layui-side-scroll">

            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <shiro:hasPermission name="qxgl:list"><ul class="layui-nav layui-nav-tree"  lay-shrink="all" id="lm">
                <li class="layui-nav-item">
                    <a class="" href="javascript:;">权限管理</a>
                    <dl class="layui-nav-child">
                        <shiro:hasPermission name="yhjs:list"><dd><a href="javascript:showTab(20000,'userlimit.jsp','用户角色');">用户角色</a></dd></shiro:hasPermission>
                        <shiro:hasPermission name="zygl:list"><dd><a href="javascript:showTab(20000,'resourcelimit.jsp','资源管理');">资源管理</a></dd></shiro:hasPermission>
                        <shiro:hasPermission name="jsqx:list"><dd><a href="javascript:showTab(20000,'rolelimit.jsp','角色权限');">角色权限</a></dd></shiro:hasPermission>

                    </dl>
                </li>
            </ul></shiro:hasPermission>
            <shiro:hasPermission name="kqgl:list"><ul class="layui-nav layui-nav-tree"  lay-shrink="all" id="lm2">
                <li class="layui-nav-item">
                    <a class="" href="javascript:;">考勤管理</a>
                    <dl class="layui-nav-child">
                        <shiro:hasPermission name="qjjb:list"><dd><a href="javascript:showTab(20000,'processadd.html','请假加班');">请假加班</a></dd></shiro:hasPermission>
                        <shiro:hasPermission name="dbsx:list"><dd><a href="javascript:showTab(20000,'processtodolist.html','待办事项');">待办事项</a></dd></shiro:hasPermission>
                        <shiro:hasPermission name="wdjl:list"><dd><a href="javascript:showTab(20000,'processlist.html','我的记录');">我的记录</a></dd></shiro:hasPermission>

                    </dl>
                </li>
            </ul></shiro:hasPermission>
            <shiro:hasPermission name="bmgl:list"><ul class="layui-nav layui-nav-tree"  lay-shrink="all" id="lm2">
                <li class="layui-nav-item">
                    <a class="" href="javascript:;">部门管理</a>
                    <dl class="layui-nav-child">
                        <shiro:hasPermission name="bmlb:list"><dd><a href="javascript:showTab(20000,'departlist.html','部门列表');">部门列表</a></dd></shiro:hasPermission>
                        <shiro:hasPermission name="bmxz:list"><dd><a href="javascript:showTab(20000,'departadd.html','部门新增');">部门新增</a></dd></shiro:hasPermission>
                        <shiro:hasPermission name="bmxg:list"><dd><a href="javascript:showTab(20000,'departupdate.html','部门修改');">部门修改</a></dd></shiro:hasPermission>

                    </dl>
                </li>
            </ul></shiro:hasPermission>
            <shiro:hasPermission name="yggl:list"><ul class="layui-nav layui-nav-tree"  lay-shrink="all" id="lm2">
                <li class="layui-nav-item">
                    <a class="" href="javascript:;">员工管理</a>
                    <dl class="layui-nav-child">
                        <shiro:hasPermission name="yglb:list"><dd><a href="javascript:showTab(20000,'stafflist.html','员工列表');">员工列表</a></dd></shiro:hasPermission>
                        <shiro:hasPermission name="ygpl:list"><dd><a href="javascript:showTab(20000,'staffbatch.html','员工批量');">员工批量</a></dd></shiro:hasPermission>
                        <shiro:hasPermission name="ygxg:list"><dd><a href="javascript:showTab(20000,'staffupdate.html','员工修改');">员工修改</a></dd></shiro:hasPermission>
                        <shiro:hasPermission name="ygxz:list"><dd><a href="javascript:showTab(20000,'staffadd.html','员工新增');">员工新增</a></dd></shiro:hasPermission>

                    </dl>
                </li>
            </ul></shiro:hasPermission>
            <shiro:hasPermission name="xkgl:list"><ul class="layui-nav layui-nav-tree"  lay-shrink="all" id="lm2">
                <li class="layui-nav-item">
                    <a class="" href="javascript:;">学科管理</a>
                    <dl class="layui-nav-child">
                        <shiro:hasPermission name="xklb:list"><dd><a href="javascript:showTab(20000,'courselist.html','学科列表');">学科列表</a></dd></shiro:hasPermission>
                        <shiro:hasPermission name="xkxz:list"><dd><a href="javascript:showTab(20000,'courseadd.html','学科新增');">学科新增</a></dd></shiro:hasPermission>
                        <shiro:hasPermission name="xkxg:list"><dd><a href="javascript:showTab(20000,'courseupdate.html','学科修改');">学科修改</a></dd></shiro:hasPermission>

                    </dl>
                </li>
            </ul></shiro:hasPermission>
            <shiro:hasPermission name="bjgl:list"><ul class="layui-nav layui-nav-tree"  lay-shrink="all" id="lm2">
                <li class="layui-nav-item">
                    <a class="" href="javascript:;">班级管理</a>
                    <dl class="layui-nav-child">
                        <shiro:hasPermission name="bjlb:list"><dd><a href="javascript:showTab(20000,'gradelist.html','班级列表');">班级列表</a></dd></shiro:hasPermission>
                        <shiro:hasPermission name="bjxz:list"><dd><a href="javascript:showTab(20000,'gradeadd.html','班级列表');">班级新增</a></dd></shiro:hasPermission>
                        <shiro:hasPermission name="bjxg:list"><dd><a href="javascript:showTab(20000,'gradeupdate.html','班级修改');">班级修改</a></dd></shiro:hasPermission>

                    </dl>
                </li>
            </ul></shiro:hasPermission>
            <shiro:hasPermission name="xygl:list"><ul class="layui-nav layui-nav-tree"  lay-shrink="all" id="lm2">
                <li class="layui-nav-item">
                    <a class="" href="javascript:;">学员管理</a>
                    <dl class="layui-nav-child">
                        <shiro:hasPermission name="xylb:list"><dd><a href="javascript:showTab(20000,'studentlist.html','学员列表');">学员列表</a></dd></shiro:hasPermission>
                        <shiro:hasPermission name="xydr:list"><dd><a href="javascript:showTab(20000,'studentbatch.html','学员导入');">学员导入</a></dd></shiro:hasPermission>
                        <shiro:hasPermission name="xyxz:list"><dd><a href="javascript:showTab(20000,'studentadd.html','学员新增');">学员新增</a></dd></shiro:hasPermission>

                    </dl>
                </li>
            </ul></shiro:hasPermission>
        </div>
    </div>
    <div class="layui-body" id="container" >
        <!-- 内容主体区域 -->
        <div class="layui-tab" lay-filter="demo" style="width: 100%;height: 90%">
            <ul class="layui-tab-title"></ul>
            <div class="layui-tab-content" style="width: 99%;height: 98%"></div>
        </div>
    </div>

    <div class="layui-footer">
        <p>
            Copyright 2011-2018 <a href="http://www.1000phone.com/"
                                   rel="nofollow" target="_blank" title="千锋互联">北京滴答科技有限公司 Feri
            版权所有</a> 京ICP备12003911号-3 京公网安备11010802011455号
        </p>
    </div>
</div>

<script src="media/js/jquery.min.js"></script>
<script src="media/layui/layui.js"></script>
<script>
    //JavaScript代码区域
    var element;
    layui.config({
        base: 'media/layui/lay/modules/'
    }).use(['element','app'], function(){
        element = layui.element;

        showTab(20000,"main.html","首页");
    });
    var tid=-1;
    function showTab(id,u,n) {
        if(tid>0){
            element.tabDelete('demo',tid);
        }
        element.tabAdd('demo', {
            title:n
            ,content: '<iframe data-frameid="'+id+'" scrolling="auto" frameborder="0" src="'+u+'"></iframe>' //支持传入html
            ,id:id
        });
        element.tabChange('demo', id);
        element.render();
        tid=id;
    }

</script>
</body>

</html>