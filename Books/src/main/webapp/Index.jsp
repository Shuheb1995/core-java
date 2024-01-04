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
<nav class="navbar navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="Create.jsp">Create</a>
    </div>
    <form action="read" method="get">
    <div class="container-fluid">
    <button type="submit" class="btn btn-primary">Read</button>
     </div>
     </form>
     
     <form action="find" method="get">
<input type="text" name="bookName" placeholder="Enter Book Name">
<button type="submit">Search</button>

</form>
     

    
        </nav>
        
</body>
</html>