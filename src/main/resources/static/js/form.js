$(document).ready(function() {
	$("form").submit(function(event) {
		var formdata = {
			name: $("#name").val(),
			email: $("#email").val(),
			age: $("#age").val(),
		};
		$ajax({
			type: "POST",
			url: "student",
			data: formdata,
			dataType: "json",
			encode: true,
		}).done(function(data) {
			console.log(data);
		});
		event.preventDefault();
	});
});