<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>

<title>Student Application Form</title>
</head>
<body>

	<form:form action="processForm" modelAttribute="student">

First Name: <form:input path="firstName" />
		<br>
		<br>
Last Name: <form:input path="lastName" />
		<br>
		<br>
		
		Country:<form:select path="country">
			<%-- <form:option value="Brazil" label="Brazil"></form:option>
		<form:option value="France" label="France"></form:option>
		<form:option value="India" label="India"></form:option>
		<form:option value="USA" label="USA"></form:option> --%>

			<form:options items="${student.hashMap}" />

		</form:select>

		<br>
		<br>
		Java<form:radiobutton path="favoriteLanguage" value="Java" />
		PHP<form:radiobutton path="favoriteLanguage" value="PHP" />
		Ruby<form:radiobutton path="favoriteLanguage" value="Ruby" />
		C#<form:radiobutton path="favoriteLanguage" value="C#" />

		<br>
		<br>
		Operating Systems:
		Linux<form:checkbox path="operatingSystems" value="Linux"/>
		MAC<form:checkbox path="operatingSystems" value="MAC"/>
		Windows<form:checkbox path="operatingSystems" value="Windows"/>
		
		
		<br><br>


		<input type="submit" value="Submit">

	</form:form>

</body>

</html>
