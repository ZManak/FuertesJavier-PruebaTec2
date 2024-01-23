<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOC TYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Patient Registration</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  </head>
  <body>
    <header>
      <h1>Patient Registration</h1>
    </header>

    // This is the form that will be submitted to the server

    <form action="" method="post">
      <label for="name">Name:</label><br />
      <input type="text" id="name" name="name" /><br />
      <label for="age">Age:</label><br />
      <input type="number" id="age" name="age" /><br />
      <label for="gender">Gender:</label><br />
      <input type="text" id="gender" name="gender" /><br />
      <label for="contact">Contact:</label><br />
      <input type="text" id="contact" name="contact" /><br />
      <label for="date">Date:</label><br />
      <input type="date" id="date" name="date" /><br />

      <input type="submit" value="Register" />
    </form>
  </body>
</html>
