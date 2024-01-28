<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Turn Manager</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  </head>
  <body>
    <header>
      <h1>Turn Manager</h1>
    </header>
    <main>
      <h2>Turns</h2>
      <table>
        <thead>
          <tr>
            <th>Turn</th>
            <th>Person</th>
            <th>Date</th>
            <th>Time</th>
            <th>Actions</th>
          </tr>
        </thead>
        <tbody>
          // Bring the turns from the server
          <c:forEach items="${turns}" var="turn">
            <tr>
              <td>${turn.id}</td>
              <td>${turn.person.name}</td>
              <td>
                <fmt:formatDate value="${turn.date}" pattern="yyyy-MM-dd" />
              </td>
              <td><fmt:formatDate value="${turn.time}" pattern="HH:mm" /></td>
              <td>
                <a href="./turnSv?action=edit&id=${turn.id}">Edit</a>
                <a href="./turnSv?action=delete&id=${turn.id}">Delete</a>
              </td>
            </tr>
          </c:forEach>
        </tbody>
      </table>
      <a href="./turnSv?action=create">Create</a>
    </main>
  </body>
</html>
