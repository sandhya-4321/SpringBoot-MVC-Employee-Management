<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
<head>
    <title>Update Employee</title>
</head>
<body>

<h2>Update Employee</h2>

<form action="${pageContext.request.contextPath}/employees/update" method="post">

    Employee ID:
    <input type="text" name="eid" value="${employee.eid}" readonly>
    <br><br>

    Employee Name:
    <input type="text" name="ename" value="${employee.ename}">
    <br><br>

    Salary:
    <input type="text" name="salary" value="${employee.salary}">
    <br><br>

    <input type="submit" value="Update Employee">

</form>

</body>
</html>