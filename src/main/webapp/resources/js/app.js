var token = $("meta[name='_csrf']").attr("content");
var header = $("meta[name='_csrf_header']").attr("content");


function statusOrders(checkbox, chbxParts_id, amountParts_id) {
	
	var data = {};
	
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
			{	
				$('#td_order_'+data.id).css('background-color', 'green');
				$('#'+chbxParts_id).attr('disabled','disabled');
				$('#'+amountParts_id).attr('disabled','disabled');
				//alert($('#'+chbxParts_id).prop("disabled"));
			}
			else
			{
				$('#td_order_'+data.id).css('background-color', 'white');
				$('#'+chbxParts_id).removeAttr('disabled');
				$('#'+amountParts_id).removeAttr('disabled');
			}
			//display(data);
		},
		error : function(e) {
			alert("ERROR: statusOrders()", e);
			//display(e);
		}
	});
}

function ajaxAddToBacket(id) {
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

function addProductToBacket(id)
{
	alert(id);
	location.href='add-product-to-customer-basket?id='+id+'&quantity='+$(quantity).val();
}


function isNumberKey(evt)
{
   var charCode = (evt.which) ? evt.which : event.keyCode;
   //alert(charCode);
   if (charCode > 31 && (charCode < 48 || charCode > 57))
      return false;

   return true;
}

function isNumberKeyDouble(evt)
{
   var charCode = (evt.which) ? evt.which : event.keyCode;
   //alert(charCode);
   if (charCode > 31 && (charCode < 48 || charCode > 57) && charCode != 46 )
      return false;

   return true;
}

function isNumberValue(value)
{
	var re = /[0-9999]/g;
	
	if (!re.test(value) || value==0)
	{	
	      return false;
	}

   return true;
}