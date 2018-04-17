<%@ page contentType="text/html; charset=iso-8859-1" language="java" %>
<html>
   <head>
   <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <style>
  .jumbotron {
      background-color: #8bc34a;
      color: #fff;
  }
  </style>
      <title>File Uploading Form</title>
   </head>
   
   <body>
   <div class="jumbotron text-center">
      <h3>Choose the jar file:</h3>
     <br/>
      <form action="connect" method="post" enctype="multipart/form-data">
    <center><input type="file" name="file" /></center>
    <br/>
    <input type="submit" class="btn btn-info" value="Submit Button">
      </form>
       </div>
   </body>  
</html>