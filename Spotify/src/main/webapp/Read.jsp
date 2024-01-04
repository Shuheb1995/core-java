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

<form action = "read" method = "get">
<button type = "submit">Display Songs</button>
 </form>
 <table  class="table table-dark table-sm">
 
 <c:forEach var = "dtos" items = "${readDto}">
 <tr>
 <td><h3>${dtos.songName}</h3></td>
 <td><h3>${dtos.artistName}</h3></td>
 <td><h3>${dtos.ratings}</h3></td>
 <td><h3>${dtos.album}</h3></td>
  </tr>
 </c:forEach>
</table>

<form action="find" method="get">
<input type="text" name="songName" placeholder="Enter Song Name">
<button type="submit">Search Song</button>
<h3>${songs}</h3>
<h3>${name}</h3>
</form>
<h3>${song.songName}</h3>
<h3>${song.artistName}</h3>
<h3>${song.ratings}</h3>
<h3>${song.album}</h3>
</body>
</html>