	var vehicleTypeCheck = function() {
			var nameRegex = new RegExp("^[a-zA-Z\s]+$");
			if (!document.form.vehicleType.value.match(nameRegex)) {
				if (alert("Vehicle Type can't be empty and must contain only alphabets")) {
					document.form.vehicleType.focus();
				} else
					document.activeElement.blur();
			} else {
				return false;
			}
		}
		var vehicleColorCheck = function() {
			var nameRegex = new RegExp("^[a-zA-Z\s]+$");
			if (!document.form.vehicleColor.value.match(nameRegex)) {
				if (alert("Vehicle Color can't be empty and must contain only alphabets")) {
					document.form.vehicleColor.focus();
				} else
					document.activeElement.blur();
			} else {
				return false;
			}
		}
		var vehicleModelCheck = function() {
			var nameRegex = new RegExp("^[a-zA-Z\s]+$");
			if (!document.form.vehicleModel.value.match(nameRegex)) {
				if (alert("Vehicle Model can't be empty and must contain only alphabets")) {
					document.form.vehicleModel.focus();
				} else
					document.activeElement.blur();
			} else {
				return false;
			}
		}
		function vehicleDatePurchaseCheck() {
		    let vehicleDatePurchase = document.getElementById('vehicleDatePurchase').value;
		    let now = new Date();
		    let dt1 = Date.parse(now),
		        dt2 = Date.parse(vehicleDatePurchase);
		    if (dt2 > dt1) {
		        alert("Date must be in the past or present");
		    }
		}