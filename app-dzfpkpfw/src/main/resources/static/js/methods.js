//all方法
//用户信息
function userData(){
	$.ajax({
		type:"get",
		url:"/rest/userinfo/"+sessionStorage.getItem('accountId'),
		async:true,
		dataType:"json",
		success:function(res){
            $(".c_userName").text(res.data.userName);
			var $li1 = $("<li/>").addClass("li_text"); //姓名
			var $li2 = $("<li/>").addClass("li_text"); //账户
			var $li3 = $("<li/>").addClass("li_text"); //性别
			var $li4 = $("<li/>").addClass("li_text"); //部门
			var $li5 = $("<li/>").addClass("li_text"); //组别
			var $li6 = $("<li/>").addClass("li_text"); //入职时间
			var $li7 = $("<li/>").addClass("li_text"); //组别
			$li1.text("姓名： "+res.data.userName).appendTo($(".u_ul_text"))
			$li2.text("账户： "+sessionStorage.getItem('accountName')).appendTo($(".u_ul_text"))
			$li3.text("性别： "+res.data.sex).appendTo($(".u_ul_text"))
			// $li4.text("部门： "+item.department).appendTo($(".u_ul_text"))
			// $li5.text("组别： "+item.group).appendTo($(".u_ul_text"))
			$li6.text("创建时间： "+ res.data.createTime).appendTo($(".u_ul_text"))
			// $li7.text("权限： "+item.permission).appendTo($(".u_ul_text"))
		},
		error: function(res) {
	      alert("userdata.json加载失败");
	    }
    });
}
function timestampToTime(timestamp) {
    var date = new Date(timestamp * 1000);//时间戳为10位需*1000，时间戳为13位的话不需乘1000
    Y = date.getFullYear() + '-';
    M = (date.getMonth()+1 < 10 ? '0'+(date.getMonth()+1) : date.getMonth()+1) + '-';
    D = date.getDate() + ' ';
    h = date.getHours() + ':';
    m = date.getMinutes() + ':';
    s = date.getSeconds();
    return Y+M+D+h+m+s;
}
function dateFormat_2(longTypeDate){
	var dateType = "";
	var date = new Date();
	date.setTime(longTypeDate);
	dateType = date.getFullYear()+"-"+getMonth(date)+"-"+getDay(date);//yyyy-MM-dd格式日期
	return dateType;
}
function usermenuData(name){

	// $.ajax({
	// 	type:"get",
	// 	url:"/rest/user/index",
	// 	async:true,
	// 	dataType:"json",
	// 	success:function(res){
	var res1 = "[{\"sortno\":1517160084073,\"path\":\"./html/userxinxi.html\",\"name\":\"用户信息\",\"id\":\"6319479984e02683c3cb7897ce0629ec\",\"useful\":\"1\",\"parentId\":\"\",\"desc\":\"用户信息\"},{\"sortno\":1517160152914,\"path\":\"./html/userguanli.html\",\"name\":\"用户管理\",\"id\":\"a9c802f71677a237c4cd7049d7246589\",\"useful\":\"1\",\"parentId\":\"\",\"desc\":\"用户管理\"},{\"sortno\":1517160177336,\"path\":\"./html/svnguanli.html\",\"name\":\"SVN管理\",\"id\":\"cbf742b3b75dbc99d56597d823efa06c\",\"useful\":\"1\",\"parentId\":\"\",\"desc\":\"SVN管理\"},{\"sortno\":1517160198187,\"path\":\"./html/group.html\",\"name\":\"组别\",\"id\":\"e473df447a593bf5b87db330d35ea052\",\"useful\":\"1\",\"parentId\":\"\",\"desc\":\"组别\"},{\"sortno\":1517160239228,\"path\":\"./html/platform.html\",\"name\":\"平台菜单权限\",\"id\":\"3589a640e9f3403ddaaa124713e2a685\",\"useful\":\"1\",\"parentId\":\"\",\"desc\":\"平台菜单权限\"},{\"sortno\":1517160267089,\"path\":\"./html/roleguanli.html\",\"name\":\"角色管理\",\"id\":\"3297b8954cd9dc94e3d3f6f1ac1ad42b\",\"useful\":\"1\",\"parentId\":\"\",\"desc\":\"角色管理\"},{\"sortno\":1517160304038,\"path\":\"./html/menuguanli.html\",\"name\":\"菜单管理\",\"id\":\"fc52fc29d48ffe9c3e371c0a59ba2928\",\"useful\":\"1\",\"parentId\":\"\",\"desc\":\"菜单管理\"}]";
	var res1 ="[" +
		"{\"sortno\":1517160152914,\"path\":\"./html/fptqeem.html\",\"name\":\"发票提取二维码打印\",\"id\":\"a9c802f71677a237c4cd7049d7246589\",\"useful\":\"1\",\"parentId\":\"\",\"desc\":\"发票提取二维码打印\"}," +
		"{\"sortno\":1517160152914,\"path\":\"./html/fapiaoguanli.html\",\"name\":\"发票信息管理\",\"id\":\"a9c802f71677a237c4cd7049d7246589\",\"useful\":\"1\",\"parentId\":\"\",\"desc\":\"发票信息管理\"}" +
		// ", {\"sortno\":1517160084073,\"path\":\"./html/userxinxi.html\",\"name\":\"用户信息\",\"id\":\"6319479984e02683c3cb7897ce0629ec\",\"useful\":\"1\",\"parentId\":\"\",\"desc\":\"用户信息\"}" +
		"]";
if(name!="admin"){
	res1 ="[" +
		"{\"sortno\":1517160152914,\"path\":\"./html/fptqeem.html\",\"name\":\"发票提取二维码打印\",\"id\":\"a9c802f71677a237c4cd7049d7246589\",\"useful\":\"1\",\"parentId\":\"\",\"desc\":\"发票提取二维码打印\"}" +
		//"{\"sortno\":1517160152914,\"path\":\"./html/fapiaoguanli.html\",\"name\":\"发票信息管理\",\"id\":\"a9c802f71677a237c4cd7049d7246589\",\"useful\":\"1\",\"parentId\":\"\",\"desc\":\"发票信息管理\"}" +
		// ", {\"sortno\":1517160084073,\"path\":\"./html/userxinxi.html\",\"name\":\"用户信息\",\"id\":\"6319479984e02683c3cb7897ce0629ec\",\"useful\":\"1\",\"parentId\":\"\",\"desc\":\"用户信息\"}" +
		"]";
}
	// console.info(res,"res.data： "+res.data)
			// $(".c_userName").text(res.data.userName);
			var liItem="";
			var result = JSON.parse(res1);
			// if(res.data.length==0){
			// 	$(".c_section_left .c_ul").append("您没有任何菜单权限");
			// 	return;
			// }
			for(var i = 0; i<result.length; i++){
				$(".c_section_left .c_ul").append(" <li class='menuLi' data='"+result[i].path+"'> <i class='fa fa-user fa-fw'></i> "+result[i].name+"</li>");
			}
			$(".menuLi").bind("click",function(){
				var url=$(this).attr("data");
				$(".d_rightBox").load(url);
				if(url=="./html/fptqeem.html"){
					userData();
				}
			});

		// },
		// error: function(res) {
		// 	alert("菜单加载失败");
		// }
	// });
}