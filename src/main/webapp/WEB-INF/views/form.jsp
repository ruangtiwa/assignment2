<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- Static content 
<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript" src="/resources/js/app.js"></script>-->

<title>Spring Boot</title>
</head>
<body>

<!-- css -->

<style>

header { 
       display: block;
      }

      h1 {
        text-align: center;
        color: #4ddbff;
      }
       body {
        background-color: #ff9966;
      }
      .button {
        background-color: #F9EFAF;
        border: none;
        color: black;
        padding: 15px 32px;
        text-align: center;
        text-decoration: none;
        display: inline-block;
        font-size: 16px;
        margin: 4px 2px;
        cursor: pointer;
      }

      input[type=text] {
        background-color: #F9EFAF;
        color: black;
        width: 50%;
        padding: 12px 20px;
        margin: 8px 0;
        box-sizing: border-box;
      }
      input[type=date] {
        background-color: #F9EFAF;
        color: black;
        width: 50%;
        margin: 8px 0;
        box-sizing: border-box;
      }

      textarea#detail {
      width:50%;
      direction:rtl;
      display:block;
      max-width:100%;
      line-height:1.5;
      padding:15px 15px 30px;
      border-radius:3px;
      border:1px solid #F7E98D;
      font:13px Tahoma, cursive;
      transition:box-shadow 0.5s ease;
      box-shadow:0 4px 6px rgba(0,0,0,0.1);
      font-smoothing:subpixel-antialiased;
      background:linear-gradient(#F9EFAF, #F7E98D);
      background:-o-linear-gradient(#F9EFAF, #F7E98D);
      background:-ms-linear-gradient(#F9EFAF, #F7E98D);
      background:-moz-linear-gradient(#F9EFAF, #F7E98D);
      background:-webkit-linear-gradient(#F9EFAF, #F7E98D);
    }
</style>

<!-- end of css -->

	<center>
		<h1>Add new Memo</h1>
	</center>
		
	<hr>

	<form:form method="POST" action="addMemo" modelAttribute="memo">
		
		
		<table>
			<tr>
				<td width=20></td>
				<td><form:label path="name">Name</form:label></td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td><form:label path="topic">topic</form:label></td>
				<td><form:input path="topic" /></td>
			</tr>
			<tr>
				<td><form:label path="detail">
                      detail</form:label></td>
				<td><form:input path="detail" /></td>
			</tr>
			<tr>
				<!-- THE DATE FORMAT SHOULD BE ex: 01/31/2019 -->
				<td><form:label path="dateRemind">
                      date reminder</form:label></td>
				<td><form:input path="dateRemind" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="Submit" /></td>
			</tr>
		</table>
	</form:form>


</body>
</html>