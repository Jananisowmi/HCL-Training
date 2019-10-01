/**
 * 
 */
function show() {
	var arr=[3,
	         'Hello',
	         function() {
		        return "Welcome";
      	},
      	{ 'City' : 'hyderabad',
      	'State': 'TS' }
	];
	var res="";
	res+="First element "+arr[0] + "<br/>";
	res+="Second element "+arr[1] + "<br/>";
	res+="Third element "+arr[2] () + "<br/>";
	res+="Key Value 1"+arr[3].City + "<br/>";
	res+="Key Value 2"+arr[3].State + "<br/>";
	
	document.getElementById("res").innerHTML=res;
	
}