var token = $("meta[name='_csrf']").attr("content");
var header = $("meta[name='_csrf_header']").attr("content");


function statusOrders(checkbox, chbxParts_id, amountParts_id) {
	
	var data = {};
	
	data['id']=checkbox.value;
	data['status']=checkbox.checked;
	
	if(checkbox.checked)
	{
		$('#'+chbxParts_id).attr("disabled", "disabled");
		$('#'+amountParts_id).attr("disabled", "disabled");
	}
	else
	{
		$('#'+chbxParts_id).attr("disabled", false);
		$('#'+amountParts_id).attr("disabled", false);
	}
	
	$.ajax({
		type : "POST",
		contentType : "application/json",
		url : "statusOrder",
		data : JSON.stringify(data),
		dataType : 'json',
		timeout : 100000,
		beforeSend: function(xhrr) {
            xhrr.setRequestHeader(header, token);
        },
		success : function(data) {
			if(data.status)
			{	
				$('#td_order_'+data.id).css('background-color', 'green');
				$('#'+chbxParts_id).prop("disabled", true);
				$('#'+amountParts_id).prop("disabled", true);
				//alert($('#'+chbxParts_id).prop("disabled"));
			}
			else
			{
				$('#td_order_'+data.id).css('background-color', 'white');
				$('#'+chbxParts_id).prop("disabled", false);
				$('#'+amountParts_id).prop("disabled", false);
				//alert($('#'+chbxParts_id).prop("disabled"));
			}
			//display(data);
		},
		error : function(e) {
			alert("ERROR: statusOrders()", e);
			//display(e);
		}
	});
}

function addToBacket(id) {
	$.ajax({
		type : "GET",
		url : "addToBacket?id="+id,
		timeout : 100000,
		success : function(data) {
			//display(data);
		},
		error : function(e) {
			//alert("ERROR: addToBacket()", e);
			display(e);
		}
	});
}

function addToCompare(id) {

	$.ajax({
		type : "GET",
		url : "addToCompare?id="+id,
		timeout : 100000,
		success : function(data) 
		{
			$("#compareItems").text(data.allItems);
		},
		error : function(e) {
			//alert("ERROR: addToCompare()", e);
			display(e);
		}
	});
}