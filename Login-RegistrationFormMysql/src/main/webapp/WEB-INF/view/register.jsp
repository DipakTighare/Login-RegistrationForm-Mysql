b  <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE HTML>
<html>

<head>
<style>
body{position:relative;
	}
#f1{position:absolute;
		 left:500px;padding:30px;
		 border:2px soid gray;margin:10px;
}
#h1{font-size:35px;color:blue;}
#s{background:#85cbde;border-radius:5px;border-color:#65a1ad}
</style>
</head>
<body>

<form action = "registerProcess">
<div id = "f1">
			<div id="h1"> <b>Employee Registration</b></div><br>
	
	Name<br>
	 <input id="ff" type="text" name= "name" size ="30" /><br><br>
	D.O.B<br>
	<input id ="ff" type = "date" name = "dob" min = "1988-01-01"   /> <br><br>
	Gender<br>
	
	 <input id="ff" type="radio" name = "gender" value="male" /> Male
	  <input id="ff" type="radio" name = "gender" value="female" /> Female
	   <input id="ff" type="radio" name = "gender" value="trans" /> Transgender<br><br>
			
	Address<br> 
	<input type = "text"  name = "address"  size ="30"  > <br><br>
	City<br>
	 <input id ="ff" type ="text" name = "city" size ="30" ><br><br>
	State<br>
	 <input id ="ff" type = "text" name = "state" size ="30"  ><br><br>
	Login Id <br>
	<input id ="ff" type = "text" name = "loginId" size ="30" ><br><br>
	Password <br>
	 <input id ="ff" type = "password" name = "password" size ="30" ><br><br>
	
	<input id ="s" type = "submit">
	
	<input id ="s" type = "reset">
	

           	
</div>

</form>		



</body>
</html>