/**
 * 
 */
 var i=0;
questions=[
         '1. What is Object Oriented Programming'  ,
         '2. Who is introduced Java' ,
         '3. How to declare generics' ,
         '4. String.format() used for' 
           ];
function show() {
	document.getElementById("question").innerHTML=questions[i];                                                                                                                                                              
}

function nextQuestion() {
	i=i+1;
	if(i<4) {
		show();
	} else {
		alert("Exam Over");
	}
	
}