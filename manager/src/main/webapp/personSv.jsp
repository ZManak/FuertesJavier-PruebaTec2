<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOC TYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Create Ticket</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  </head>
  <body>
    <header>
      <h1>Turn Manager</h1>
    </header>

    // This is the form that will be submitted to the server

    <h2>Submit a ticket</h2>
    <p>Fill out the form below with your name and ID number*</p>
    <form action="./personSv" method="post">
      <label for="name">Name:</label><br />
      <input type="text" id="name" name="name" /><br />
      <label for="ticketRef">Ticket Reference:</label><br />
      <input type="text" id="ticketRef" name="ticketRef" /><br />
      <label for="description">Brief issue description:</label><br />
      <input type="text" id="description" name="description" /><br />
      <label for="date">Date of the incidence (by default today):</label><br />
      <input type="date" id="date" name="date" /><br />

      <input type="submit" action="./personSv" method="post" value="Register" />
    </form>
    // This is the script that will be executed when the form is submitted


    <p>*A new user will be created if they are not yet registered</p>
  </body>
</html>
