package prueba2.manager.service;

import prueba2.manager.logic.Person;

import javax.servlet.http.HttpServletRequest;
import java.sql.*;

public class PersonService {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/managerdb?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    public HttpServletRequest saveTicket(Person person, int ticketNumber, String description, Date date) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String sql = "INSERT INTO turn (description, PERSONID, onDate, number) VALUES (?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, description);
            statement.setInt(2, person.getId());
            statement.setDate(3, date);
            statement.setInt(4, ticketNumber);
            statement.executeUpdate();

            System.out.println("Ticket created: " + ticketNumber);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
