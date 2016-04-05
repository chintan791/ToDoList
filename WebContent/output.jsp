
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>TO DO LIST</title>
</head>
<body>


	<table class="table table-bordered" border="1" style="width: 100%">
		<tr>
			<th>Name</th>
			<th>Task</th>
			<th>Description</th>
			<th>Priority</th>
			<th>Due Date</th>
			<th>Completion Date</th>
		</tr>
		<c:forEach var="item" items="${list1}">
			<form action="MainServlet" method="post">
				<tr>
					<td><c:out value="${item.user.username}"></c:out></td>
					<td><c:out value="${item.task}"></c:out></td>
					<td><c:out value="${item.description}"></c:out></td>
					<td><c:out value="${item.priority}"></c:out></td>
					<td><c:out value="${item.duedate}"></c:out></td>
					<td><c:out value="${item.datecompleted}"></c:out></td>
				</tr>
			</form>
		</c:forEach>


	</table>

<br>
<br>


<form action="InsertServlet" method="post">
	
	enter username:
	        <input name="username" type="text" value="${param.username}">
	enter todoid:
	        <input name="todoid" value="${param.todoid}">
	enter task:
	        <input name="task" value="${param.task}">
	enter description:
	        <input name="description" value="${param.description}">
	enter priority:
	        <input name="priority" value="${param.priority}">

	enter duedate:
	        <input name="duedate" type="date" value="${param.duedate}">
	enter datecompleted:
	        <input name="datecompleted" type="date" value="${param.datecompleted}">        
			<input type="submit"><br>		
	</form>

</body>
</html>