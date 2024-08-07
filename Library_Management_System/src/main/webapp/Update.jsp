<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Book</title>
</head>
<body>
<h2 style="align:center,color:green">Update Book Here</h2>
<form action="UpdateBookServlet" method="post">
Book id:<input type="text" value="${book.id}" required>
Title:<input type="text" value="${book.title}" required>
Author:<input type="text" value="${book.author}" required>
Price:<input type="text" value="${book.price}" required>
<input type="submit" value="Submit">

<input type="submit" value="Cancel">
</form>
<a href="booklist.jsp">View Book</a>

</body>
</html>