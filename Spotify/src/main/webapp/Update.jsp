<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update" method="post">
<input type="text" name="songName" placeholder="Song Name">
<h2>${name}</h2>
<input type="text" name="ratings" placeholder="New Ratings">
<h2>${rate}</h2>
<button type="submit">Update</button>
<h2>${ratings}</h2>
</form>

<form action="delete" method="post">
<input type="text" name="songName" placeholder="Song Name">
<h2>${song}</h2>
<button type="submit">Delete</button>
<h2>${delete}</h2>
</form>


</body>
</html>