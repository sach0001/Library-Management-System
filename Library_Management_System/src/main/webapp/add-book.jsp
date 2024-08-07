<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Book</title>
</head>
<body>
<div align="center"> 
<h2>Please add your book here..!!</h2>
<form action="addBookServlet" method="post">
Title:<input type="text" name="title" required><br><br>
Author:<input type="text" name="author" required><br><br>
Price:<input type="text" name="price" required><br><br>


<input type="submit" value="Submit">
<input type="reset" value="Cancel">



</form>
</div>
<a href="booklist.jsp">Book List</a>
</body>
</html>