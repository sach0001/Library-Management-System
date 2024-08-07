<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Book List</title>
</head>
<body>
	<div align="center">
		<h2>Books List</h2>
		<table border="1">
			<tr>
				<th>Book Id</th>
				<th>Title</th>
				<th>Author</th>
				<th>Price</th>
				<th>Actions</th>
			</tr>
		<%
           List<Book> booklist = (List<Book>) request.getAttribute("books");
        
        for (Book book : booklist) {
        %>
        <tr>
            <td><%= book.getBid() %></td>
            <td><%= book.getTitle() %></td>
            <td><%= book.getAuthor() %></td>
            <td><%= book.getPrice() %></td>
            
        </tr>
        <%
        }
        
       %>
			
</table> 
			
         <a href="add-book.jsp"></a>
         
	</div>

</body>
</html>