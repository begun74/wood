

function jsonSec() 
{
	var data = {};
	var csrfParameter = $("meta[name='_csrf_parameter']").attr("content");
	var csrfToken = $("meta[name='_csrf']").attr("content"); 
	var csrfHeader = $("meta[name='_csrf_header']").attr("content");  // THIS WAS ADDED
	
	data['csrfParameter'] = csrfToken;
	data['csrfToken'] = csrfToken;    
	data['csrfHeader'] = csrfHeader;   
	
	return data;
}

function saveOrders(checkbox) {
	
	//alert(checkbox.value+'  '+checkbox.checked);
	var token = $("meta[name='_csrf']").attr("content");
	var header = $("meta[name='_csrf_header']").attr("content");
	
	var data = {};
	data['id']=checkbox.value;
	data['status']=checkbox.checked;
	//alert(data.csrfParameter+'  '+data.csrfToken+'  '+data.csrfHeader);
	$.ajax({
		type : "POST",
		contentType : "application/json",
		url : "statusOrder",
		data : JSON.stringify(data),
		dataType : 'json',
		timeout : 100000,
		beforeSend: function(xhr) {
            xhr.setRequestHeader(header, token);
        },
		success : function(data) {
			//alert("SUCCESS: ", data);
			display(data);
		},
		error : function(e) {
			//alert("ERROR: ", e);
			display(e);
		},
		done : function(e) {
			console.log("DONE");
		}
	});
}