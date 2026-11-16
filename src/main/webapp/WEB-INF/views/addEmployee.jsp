<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
	<title>add employee data</title>
</head>
<body>
	
	<form action="/employees/saveEmp" method="post">
		<h1>Add Employee</h1>
		Employee Name: <input type="text" name="ename" required/><br><br>
		Employee Salary: <input type="number" name="sal" required/><br><br>
		<input type="submit" value="Register"/>
		
	</form>
		
	
</body>
</html>
