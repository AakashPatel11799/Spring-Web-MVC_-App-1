<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<h2>Student Registration Form:</h2>
	<font color="green">${msg} </font>
	<form:form action="save" modelAttribute="student" method="POST">

		<table>
			<tr>
				<td>Name:</td>
				<td><form:input path="studentName" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><form:input path="studentEmail" /></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td><form:radiobutton path="gender" value="Male"/>Male 
				<form:radiobutton
						path="gender" value="Female"/>Female</td>
			</tr>
			<tr>
				<td>Course:</td>
				<td><form:select path="course">
						<form:option value="">-select-</form:option>
						<form:options items="${courses}" />
					</form:select></td>
			</tr>

			<tr>
				<td>Timings:</td>
				<td><form:checkboxes items="${timings}" path="timings"></form:checkboxes>
				</td>
			</tr>

			<tr>
				<td></td>
				<td><input type="submit" value="save" /></td>
			</tr>
			
		</table>
		
	</form:form>

</body>
</html>