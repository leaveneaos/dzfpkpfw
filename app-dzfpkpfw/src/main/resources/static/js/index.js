;$(function(){
	window.onresize = function(){
		var $containerHeight = $(".container").height();
		$(".c_section").height($containerHeight - 50 + "px");
	}
	var $containerHeight = $(".container").height();
	$(".c_section").height($containerHeight - 50 + "px");
	$(".d_rightBox").load("html/fptqeem.html");
	//加载用户信息
    userData();
	//加载用户菜单权限
	usermenuData();
	/*$(".li1").click(function(){
		$(".d_rightBox").load("html/userxinxi.html");
		userData();
	})	
	$(".li2").click(function(){
		$(".d_rightBox").load("./html/userguanli.html");
	})		
	$(".li3").click(function(){
		$(".d_rightBox").load("./html/svnguanli.html");
	})		
	$(".li4").click(function(){
		$(".d_rightBox").load("./html/group.html");
	})
	$(".li5").click(function(){
		$(".d_rightBox").load("./html/platform.html");
	});
	$(".li6").click(function(){
		$(".d_rightBox").load("./html/roleguanli.html");
	});
	$(".li7").click(function(){
		$(".d_rightBox").load("./html/menuguanli.html");
	});*/
});


