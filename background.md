<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>启航兼职管理信息系统</title>
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="css/fullcalendar.css" />
<link rel="stylesheet" href="css/matrix-style.css" />
<link rel="stylesheet" href="css/matrix-media.css" />
<link href="font-awesome/css/font-awesome.css" rel="stylesheet" />
</head>
<body> 
<!--Header-part-->
<div id="header">
  <h1><font style="color:gray"><a href="index.html">启航兼职</a></font></h1>
</div>
<!--close-Header-part--> 
<!--top-Header-menu-->
<div id="user-nav" class="navbar navbar-inverse">
  <ul class="nav">
    <li  class="dropdown" id="profile-messages" ><a title="" href="#"><i class="icon icon-user"></i>  <span class="text">Welcome User</span><b class="caret"></b></a>
      <ul class="dropdown-menu">
        <li class="divider"></li>
        <li><a href="adminlogin.jsp"><i class="icon-key"></i>登出</a></li>
      </ul>
    </li>
    <li class=""><a title="" href="login.html"><i class="icon icon-share-alt"></i> <span class="text">Logout</span></a></li>
  </ul>
</div>
<!--sidebar-menu-->
<div id="sidebar"><a href="#" class="visible-phone"><i class="icon icon-home"></i>后台主页</a>
  <ul>
    <li  class="active"><a href="background.jsp"><i class="icon icon-home"></i> <span>后台主页</span></a> </li>
    <li><a href="information.html"><i class="icon-pencil"></i> <span>兼职信息管理</span></a> </li>
    <li class="submenu"> <a href="#"><i class="icon icon-list"></i> <span>用户管理</span> <span class="label label-important">3</span></a>
      <ul>
        <li><a href="userregister.html">注册新用户</a></li>
        <li><a href="userinformation.html">用户信息管理</a></li>
        <li><a href="userappointment.html">用户预约管理</a></li>
      </ul>
    </li>
    <li class="submenu"><a href="#"><i class="icon icon-th"></i> <span>商家管理</span> <span class="label label-important">3</span></a> 
   	  <ul>
        <li><a href="merchantregister.html">注册新商家</a></li>
        <li><a href="merchantinformation.html">商家信息管理</a></li>
        <li><a href="merchantjob.html">商家兼职管理</a></li>
      </ul>
      </li>
    <li class="submenu"><a href="#"><i class="icon icon-fullscreen"></i> <span>员工管理</span> <span class="label label-important">4</span></a>
      <ul>
        <li><a href="staffregister.jsp">添加新员工</a></li>
        <li><a href="staffinformation.jsp">员工信息管理</a></li>
        <li><a href="user-staff.jsp">用户组员工管理</a></li>
        <li><a href="merchant-staff.jsp">商家组员工管理</a></li>
      </ul>
    </li>
    
    
  </ul>
</div>

<!--main-container-part-->
<div id="content">
  <div id="content-header">
    <div id="breadcrumb">
    <a href="#" title="返回后台主页" class="tip-bottom">
    <i class="icon-home"></i>Home</a></div>
  </div> 
  <div class="container-fluid">
    <div class="quick-actions_homepage">
      <ul class="quick-actions">
        <li class="bg_lb"> <a href="background.jsp"> <i class="icon-dashboard"></i>主页</a> </li>
        <li class="bg_lg span3"><a href="information.html"> <i class="icon-pencil"></i>兼职信息管理</a> </li>
        <li class="bg_ly"> <a href="userregister.html"> <i class="icon-th-list"></i>注册新用户</a> </li>
        <li class="bg_ly"> <a href="userinformation.html"> <i class="icon-th-list"></i>用户信息</a> </li>
        <li class="bg_ly"> <a href="userappointment.html"> <i class="icon-th-list"></i>用户预约</a> </li>
        <li class="bg_lo"> <a href="merchantregister.html"> <i class="icon-th"></i>注册新商家</a> </li>
        <li class="bg_lo"> <a href="merchantinformation.html"> <i class="icon-th"></i>商家信息</a> </li>
        <li class="bg_lo"> <a href="merchantjob.html"> <i class="icon-th"></i>商家兼职</a> </li>
        <li class="bg_ls"> <a href="staffregister.jsp"> <i class="icon-fullscreen"></i>添加员工</a></li>
        <li class="bg_ls"> <a href="user-staff.html"> <i class="icon-fullscreen"></i>用户员工</a></li>
        <li class="bg_ls"> <a href="merchant-staff.html"> <i class="icon-fullscreen"></i>商家员工</a></li>
      </ul>
    </div>
  <div class="row-fluid">
      <div class="widget-box">
        <div class="widget-title bg_lg">
          <span class="icon"><i class="icon-signal"></i></span>
          <h5>最近更新</h5>
        </div>
        <div class="widget-content" >
         <hr/>
    <div class="row-fluid">
      <div class="span9">        
          <div class="widget-title bg_ly"><span class="icon"><i class="icon-chevron-down"></i></span>
            <h5>最新消息</h5>
          </div>
          <div class="widget-content nopadding collapse in" id="collapseG2">
            <ul class="recent-posts">
              <li>
                <div class="user-thumb"> <img width="40" height="40" alt="User" src="img/demo/av1.jpg"> </div>
                <div class="article-post"> <span class="user-info"> By: john Deo / Date: 2 Aug 2012 / Time:09:27 AM </span>
                  <p><a href="#">This is a much longer one that will go on for a few lines.It has multiple paragraphs and is full of waffle to pad out the comment.</a> </p>
                </div>
              </li>
              <li>
                <div class="user-thumb"> <img width="40" height="40" alt="User" src="img/demo/av2.jpg"> </div>
                <div class="article-post"> <span class="user-info"> By: john Deo / Date: 2 Aug 2012 / Time:09:27 AM </span>
                  <p><a href="#">This is a much longer one that will go on for a few lines.It has multiple paragraphs and is full of waffle to pad out the comment.</a> </p>
                </div>
              </li>
              <li>
                <div class="user-thumb"> <img width="40" height="40" alt="User" src="img/demo/av4.jpg"> </div>
                <div class="article-post"> <span class="user-info"> By: john Deo / Date: 2 Aug 2012 / Time:09:27 AM </span>
                  <p><a href="#">This is a much longer one that will go on for a few lines.Itaffle to pad out the comment.</a> </p>
                </div>
              <li>
              </li>
            </ul>
          </div>
        </div>
            <div class="span3">
              <ul class="site-stats">
                <li class="bg_lh"><i class="icon-user"></i> <strong>2540</strong> <small>总用户人数</small></li>
                <li class="bg_lh"><i class="icon-plus"></i> <strong>120</strong> <small>最新用户人数</small></li>
                <li class="bg_lh"><i class="icon-shopping-cart"></i> <strong>6560</strong> <small>总商家人数</small></li>
                <li class="bg_lh"><i class="icon-tag"></i> <strong>954</strong> <small>最新商家人数</small></li>
                <li class="bg_lh"><i class="icon-repeat"></i> <strong>10</strong> <small>未完成兼职</small></li>
                <li class="bg_lh"><i class="icon-globe"></i> <strong>8540</strong> <small>总兼职发布</small></li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </div>
<hr/>
    <div class="row-fluid">
      <div class="span6">
        <div class="widget-box">
          <div class="widget-title bg_ly"><span class="icon"><i class="icon-chevron-down"></i></span>
            <h5>Latest Posts</h5>
          </div>          
          </div>
        </div> 
     </div>
  </div>
</div>
<!--End-main-container-part-->
<!--Footer-part-->
<div class="row-fluid">
  <div id="footer" class="span12"> 2015 &copy;启航兼职俱乐部管理信息系统 </div>
</div>
<!--end-Footer-part-->
<script src="js/jquery.min.js"></script> 
<script src="js/jquery.ui.custom.js"></script> 
<script src="js/bootstrap.min.js"></script> 
<script src="js/matrix.js"></script>
</body>
</html>
