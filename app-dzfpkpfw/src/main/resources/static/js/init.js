;$(function(){
    window.onresize = function(){
        var $containerHeight = $(".container").height();
        $(".c_section").height($containerHeight - 50 + "px");
    }
    var $containerHeight = $(".container").height();
    $(".c_section").height($containerHeight - 50 + "px");

    $(".li6").click(function(){
        $(".d_rightBox").load("./html/roleguanli.html");
    });
});


