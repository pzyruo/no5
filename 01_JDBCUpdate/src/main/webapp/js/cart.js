$(function() {
	// 购物车的复选框全选
	$('.Allcheck').click(function(event) {
		if ($(this).hasClass('checked')) {
			$(this).removeClass('checked');
			$('.indent .checkbox').removeClass('checked');
			setTotal(); 
		}else{
			$(this).addClass('checked');
			$('.indent .checkbox').addClass('checked');
			setTotal(); 
		}
	});
	$('.lincheck').click(function(event) {
			if ($(this).hasClass('checked')) {
				$(this).removeClass('checked');
				$('.Allcheck').removeClass('checked');
				setTotal(); 
			} else{
				$(this).addClass('checked');
				var flag = 1;
				$(".lincheck").each(function(){
        			if(!$(this).hasClass("checked")){
              		flag = 0;
        			}
				});
				if(flag == 0){
    				$(".Allcheck").removeClass("checked");
				}else{
      				$(".Allcheck").addClass("checked");

				}
				setTotal(); 
			};
	});
	// 删除
	$('.IAbdw delet').click(function(event) {
		$(this).parentsUntil('.IAbdArea').remove();
	});
	// 购物车金额结算
	$(' .IAul .reduce').click(function(event){
		var reduceObj = $(this);
		var n=parseFloat(reduceObj.siblings('input').val());
		n--;
		if (n>=1) {
			//ajax.
			var itemId = reduceObj.attr("itemId");
			alert("reduce");
			$.ajax({
				type:"GET",
				data:{"itemId":itemId,"num":n},
				url:"cart/updateNum.do",
				dataType:"JSON",
				success:function(dataObj){
					if(dataObj.isok) {
						reduceObj.siblings('input').val(n);
						var onePreice = parseFloat(reduceObj.parent('.num').siblings('.price').find('u').html());
						var OlAll = n * onePreice;
						reduceObj.parent('li').siblings('.Lastprice').children('u').html(OlAll.toFixed(2));
						console.log(OlAll);
						setTotal();
					}
				}
			});
		}
	});
	$(' .IAul .add').click(function(event) {
		var addObj = $(this);
		var n=parseFloat(addObj.siblings('input').val());
		n++;
		var itemId = addObj.attr("itemId");
		// alert("add");
		$.ajax({
			type:"GET",
			data:{"itemId":itemId,"num":n},
			url:"cart/updateNum.do",
			dataType:"JSON",
			success:function(dataObj){
				if(dataObj.isok){
					addObj.siblings('input').val(n);
					var onePreice=parseFloat(addObj.parent('.num').siblings('.price').find('u').html());
					var OlAll=n*onePreice;
					addObj.parent('li').siblings('.Lastprice').children('u').html(OlAll.toFixed(2));
					setTotal(); 
				}
			},
			error:function (){
				alert("error");
			}
		});
	});


	function setTotal(){
		var s=0;
		var nu=0;
		$(".IAbdArea .IAbdw").each(function(){ 
			if ($(this).find('.lincheck').hasClass('checked')) {
				s+=parseInt($(this).find('.Lastprice u').html());
				nu+=parseInt($(this).find('.num input').val());
			};
		}); 
		$("#allpri").html(s.toFixed(2)); 
		$('#allnum').html(nu);
		} 
		setTotal(); 
});