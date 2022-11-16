

function add(num){
	return num+1;
}


function ValidateEmail(input) {

  var validRegex = /^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\.[a-zA-Z0-9-]+)*$/;

  if (input.match(validRegex)) {
		 return true;
} else {
		return false;
	}



}

function validatePhone(num) {
    
    var re = /^[\+]?[(]?[0-9]{3}[)]?[-\s\.]?[0-9]{3}[-\s\.]?[0-9]{4,6}$/im;
    
    var result = num.match(re);
    var length = num.length;
    if (result && length == 13 ) {
        return true;
    }
   else{
       return false;
   }
}