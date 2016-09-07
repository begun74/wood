

function jsonSec() 
{
	var token = $("meta[name='_csrf']").attr("content");
	var header = $("meta[name='_csrf_header']").attr("content");
	
	var data={};
	
	data['csrfToken'] = token;    
	data['csrfHeader'] = header;   
	
	return data;
}

function statusOrders(checkbox) {
	
	
	var token = $("meta[name='_csrf']").attr("content");
	var header = $("meta[name='_csrf_header']").attr("content");
	
	var data = jsonSec();
	
	data['id']=checkbox.value;
	data['status']=checkbox.checked;

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
				$('#td_order_'+data.id).css('background-color', 'green');
			else
				$('#td_order_'+data.id).css('background-color', 'white');
			//display(data);
		},
		error : function(e) {
			alert("ERROR: ", e);
			//display(e);
		}
	});
}