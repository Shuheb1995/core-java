<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>

 <form class="d-flex" action = "save" method = "post">
        <div>
        <input class="form-control me-2" type="text" name =  "bookName" placeholder="Book Name" aria-label="Search">
        <h3>${bookName}</h3>
        <h3>${find}</h3>
        </div>
        <div>
         <input class="form-control me-2" type="text" name =  "author" placeholder="Author Name" aria-label="Search">
         <h3>${author}</h3>
         </div>
         <div>
          <input class="form-control me-2" type="text" name =  "publisher" placeholder="Publisher Name" aria-label="Search">
          <h3>${publisher}</h3>
          </div>
          
          <div>
           <input class="form-control me-2" type="text" name =  "publishedIn" placeholder="Published Date" aria-label="Search">
           <h3>${publishedIn}</h3>
           </div>
           <div>
            <input class="form-control me-2" type="text" name =  "language" placeholder="Language" aria-label="Search">
            <h3>${language}</h3>
            </div>
            <div>
            <input class="form-control me-2" type="text" name =  "content" placeholder="Content" aria-label="Search">
            <h3>${content}</h3>
            </div>
            <div>
        <button class="btn btn-outline-success" type="submit">Create</button>
        </div>
      </form>

</body>
</html>