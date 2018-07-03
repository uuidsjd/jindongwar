<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
<head>
<title></title>
<style type="text/css">

/* 公共样式 */
 * { padding: 0; margin: 0; list-style: none; font-size: 14px; }
 .hide { display: none; }
 input { outline: none; }
 
 /* 模拟下拉框 */
 .select { position: relative; margin: 50px 0 0 100px; }
 .select .input_in input { width: 188px; height: 20px; line-height: 20px; padding: 10px 0 10px 10px; border: 1px solid #d6d6d6; cursor: pointer; }
 .select .city { position: absolute; top: 40px; left: 0; }
 .select .city ul { width: 198px; border: 1px solid #d6d6d6; border-top: none; }
 .select .city ul li { padding-left: 10px; width: 188px; height: 40px; line-height: 40px; cursor: pointer; }
</style>
<script type="text/javascript" src="jquery-3.3.1.js"></script>
<script type="text/javascript">
$(function(){
	$('.select input').click(function(){
    if($('.select .city').is('.hide')){
        $('.select .city').removeClass('hide');
    }else{
        $('.select .city').addClass('hide');
    }
})

$('.select ul li').on('click',function(){
    $('.select input').val($(this).html());
    $('.select .city').addClass('hide');
    $('.select input').css('border-bottom','1px solid $d6d6d6');
})
$('.select ul li').hover(
    function(){
        $(this).css({'backgroundColor':'#fd9','font-size':'18px'});
    },function(){
        $(this).css({'backgroundColor':'#fff','font-size':'14px'});
    }
)
})




</script>

<script type="text/javascript">
	$(function(){
		$('.select .input_in input').click(function(){
			
		})
	})
</script>
</head>
<script type="text/javascript">
	function startup(){
		var username1 = document.getElementById("username1").value;
		var password1 = document.getElementById("password1").value;
		alert(username1);
		alert(password1);
		if(confirm("Yes?")){
			var url = "Servlet01.do?username="+username1+"password"+password1;
			form1 = document.getElementById("form1");
			form1.attr("action",url);
			form1.submit();
		}
	}
	
</script>
<body>
<form name="form1" id="form1" action="Servlet01" method="post">
	<table>
		<tr>
			<td>用户名：</td>
			<td><input type="text" id="username1" name="username1" placeholder="请输入用户名"/></td>
		</tr>
		<tr>
			<td>密码：</td>
			<td><input type="password" id="password1" name="password1" placeholder="请输入密码"/></td>
		</tr>
		<tr>
			<td><input type="submit"  value="提交"/></td>
		</tr>
	</table>
	
	<a href="httpClient01.do">httpClient连接</a>
	<div class="select">
     <div class="input_in">
         <input type="text" value="D.C" />
     </div>
     <div class="city hide">
         <ul>
             <li>New York1</li>
             <li>New York2</li>
             <li>New York3</li>
             <li>New York4</li>
             <li>New York5</li>
             <li>New York6</li>
         </ul>
     </div>
 </div>
 <script type="text/javascript">
//  	document.oncontextmenu=function(){
//  		return false;
//  	}
 </script>
 
 <div>
 	<input id="div1" type="text" value="" onmousedown="events(event)"/>
 	<script type="text/javascript">
 		function events(event){
 			var shuzhi = event.button;
 			if(shuzhi==0){
 				alert("鼠标左键");
 			}else if(shuzhi==1){
 				alert("鼠标中键");
 			}else if(shuzhi==2){
 				alert("鼠标右键");
 			}else{
 				alert("非鼠标键");
 			}
 		}
 	</script>
 </div>
 <div>
 	<div><a href="downFile.do">下载文件</a></div>
 </div>
 
  <div>
 	<div><a href="loadFile.do">上传图片</a></div>
 </div>
<%-- <% String req = (String)request.getParameter("username1"); %> --%>
<%-- <% session.setAttribute("username2", (String)request.getParameter("username1")); %> --%>
<%-- <% session.setAttribute("password2", (String)request.getParameter("password1")); %> --%>
<%-- <%=req %> --%>
</form>
</body>
</html>