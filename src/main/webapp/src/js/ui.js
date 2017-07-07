$(document).ready(function(){
  $(".js-openPop").on("click",function(e){
    e.preventDefault();

    var topPosition = $(window).scrollTop()+100;

    $(".dim").fadeIn(200);
    $(".popup").css("top",topPosition).fadeIn(200);
  });

  $(".js-closePop").on("click",function(e){
    e.preventDefault();

    $(".dim").hide();
    $(".popup").hide();
  });

  if($(".dropBox").length !== 0){
    $(".list").mCustomScrollbar();
    dropBox();
  }
});

$(window).load(function(){
  pageMotion();
});

//dropBox
function dropBox(){
		var $dropBox = $(".dropBox");
		var $btn_dropBox = $(".dropBox>input");
    var $list = $dropBox.find(".list");

		$btn_dropBox.on("click",function(e){
      var $wrap = $(this).parent();
      if($wrap.hasClass("is-open")){
        $wrap.removeClass("is-open");
        $wrap.find("ul").hide();
      }else{
        $wrap.addClass("is-open");
        var $list = $wrap.find("ul");
  			$list.show();
      }
		})

		$dropBox.on("mouseleave",function(){
      var $wrap = $(this);
			if($wrap.hasClass("is-open")){
        $wrap.removeClass("is-open");
				var $list = $wrap.find("ul");
				$list.hide();
			}
		})

		// dropBox 선택 후 input 값 변경
		$list.find("a").on("click",function(e){
			e.preventDefault();

			var selectValue = $(this).text();
			var $wrap = $(this).parents(".dropBox");

			$wrap.find("input").val(selectValue);
			$wrap.find("ul").hide();
		})
}

function pageMotion(){
  var $target = $(".motion");
  var $tab = $(".is-current");
  $tab.animate({"top":100});
  TweenMax.from($target,0.5,{y:50, autoAlpha:0, ease:Power1.easeInOut});
  TweenMax.fromTo($tab,0.8,{x:-5},{x:0, ease:Power1.easeInOut, repeat:5});
}

function chkEvent(){
    var $eventCheck = $(".event input");
    if($eventCheck[0].checked){
      $(".tbl_hidden").css("display","table");
    }else{
      $(".tbl_hidden").css("display","none");
    }
}
