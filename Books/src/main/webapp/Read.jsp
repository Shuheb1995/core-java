<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>

<h3>${book.bookName}</h3>
 <h3>${book.author}</h3>
 <h3>${book.publisher}</h3>
 <h3>${book.publishedIn}</h3>
 <h3>${book.language}</h3>
 <h3>${book.content}</h3>
 <h3>${findBook}</h3>

<table class="table table-success table-striped">

<c:forEach var="dtos" items="${readData}">

<tr>
 <td><h3>${dtos.bookName}</h3></td>
 <td><h3>${dtos.author}</h3></td>
 <td><h3>${dtos.publisher}</h3></td>
 <td><h3>${dtos.publishedIn}</h3></td>
 <td><h3>${dtos.language}</h3></td>
 <td><h3>${dtos.content}</h3></td>
  </tr>

</c:forEach>

</table>
     


<form action="find" method="get">
  <div class="mb-3">
    <input type="text" class="form-control" name="bookName" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Book Name">
  </div>
  
  <button type="submit" class="btn btn-primary">Read Content</button>
  <h3>${book}</h3>
</form>


</body>
</html>