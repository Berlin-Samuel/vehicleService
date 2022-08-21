let userNameCheck = function() {
		 let nameRegex = `^[a-zA-Z\s]+$`;
		 if(!document.form.userName.value.match(nameRegex)){
				if(alert("Name can't be empty and must contain only alphabets")){ 
					 document.form.userName.focus();
			    }
				else
					document.activeElement.blur();
			}
	    else{
	        return false;
	    } 
	}
	let aadharNumberCheck = function() {
		 let nameRegex = `^[0-9]{4}[0-9]{4}[0-9]{4}$`;
		 if(!document.form.aadharNumber.value.match(nameRegex)){
				if(alert("Aadhar Number can't be empty and must contain only Numbers")){ 
					 document.form.aadharNumber.focus();
			    }
				else
					document.activeElement.blur();
			}
	    else{
	        return false;
	    } 
	}
	let mobileNumberCheck = function() {
		 let nameRegex = `[0-9]{10}`;
		 if(!document.form.mobileNumber.value.match(nameRegex)){
				if(alert("Phone number must have 10 digits")){ 
					 document.form.mobileNumber.focus();
			    }
				else
					document.activeElement.blur();
			}
	    else{
	        return false;
	    } 
	 }
	let userEmailCheck = function() {
		 let nameRegex = `^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$`;
		 if(!document.form.userEmail.value.match(nameRegex)){
				if(alert("Email not in the correct format")){ 
					 document.form.userEmail.focus();
			    }
				else
					document.activeElement.blur();
			}
	    else{
	        return false;
	    } 
	}
	let userPasswordCheck = function() {
		 let nameRegex = `^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$`;
		 if(!document.form.userPassword.value.match(nameRegex)){
				if(alert("Password must begin with letter and must contain one number and must have atleast 8 characters")){ 
					 document.form.userPassword.focus();
			    }
				else
					document.activeElement.blur();
			}
	    else{
	        return false;
	    } 
	}