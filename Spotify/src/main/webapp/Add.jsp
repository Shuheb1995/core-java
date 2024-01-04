<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="save" method="post">
<input type="text" name = "songName" placeholder="Song Name">
<h2>${songName}</h2>
<input type="text" name = "artistName" placeholder="Artist Name">
<h2>${artistName}</h2>
<input type="number" name = "ratings" placeholder="Ratings">
<h2>${ratings}</h2>
<input type="text" name = "album" placeholder="Album Name">
<h2>${album}</h2>
<button type="submit">Add</button>
</form>

</body>
</html>