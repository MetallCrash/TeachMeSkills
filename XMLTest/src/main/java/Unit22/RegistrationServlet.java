package Unit22;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegistrationServlet extends HttpServlet {
    private static final String LOGIN_PARAM = "log_register";
    private static final String PASSWORD_PARAM = "pas_register";
    private static final String FIRST_NAME_PARAM = "firstName_register";
    private static final String LAST_NAME_PARAM = "lastName_register";


    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/users?" +
            "allowPublicKeyRetieval=true&useSSL=false&useUnicode=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    protected void processRequest(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        PrintWriter writer = resp.getWriter();
        String login = req.getParameter(LOGIN_PARAM);
        String password = req.getParameter(PASSWORD_PARAM);
        String firstName = req.getParameter(FIRST_NAME_PARAM);
        String lastName = req.getParameter(LAST_NAME_PARAM);

        String sqlInsert = "INSERT INTO user_data (login, password, first_name, last_name) VALUES (?,?,?,?)";
        try (Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(sqlInsert)) {
            statement.setString(1, login);
            statement.setString(2, password);
            statement.setString(3, firstName);
            statement.setString(4, lastName);
            statement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setCharacterEncoding("UTF-8");
//        PrintWriter writer = resp.getWriter();
//        String login = req.getParameter(LOGIN_PARAM);
//        String password = req.getParameter(PASSWORD_PARAM);
//        String firstName = req.getParameter(FIRST_NAME_PARAM);
//        String lastName = req.getParameter(LAST_NAME_PARAM);
//
//        String sqlInsert = "INSERT INTO user_data (login, password, first_name, last_name) VALUES (?,?,?,?)";
//        try (Connection connection = DriverManager.getConnection(DATABASE_URL,USER, PASSWORD);
//             PreparedStatement statement = connection.prepareStatement(sqlInsert)){
//            statement.setString(1,login);
//            statement.setString(2,password);
//            statement.setString(3,firstName);
//            statement.setString(4,lastName);
//            statement.executeUpdate();
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
        processRequest(req, resp);
    }
}
