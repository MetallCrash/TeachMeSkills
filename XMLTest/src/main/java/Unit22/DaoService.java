package Unit22;

import java.sql.*;

public class DaoService {
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/user_registration?" +
            "allowPublicKeyRetrieval=true&useSSL=false&useUnicode=true&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public void addUser(String login, String password, String firstName, String lastName) {
        if (validate(login)) {
            final String sqlInsert = "INSERT INTO user_registration.user_data (login, password, first_name, last_name) VALUES (?,?,?,?)";
            try (Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
                 PreparedStatement statement = connection.prepareStatement(sqlInsert)) {
                statement.setString(1, login);
                statement.setString(2, password);
                statement.setString(3, firstName);
                statement.setString(4, lastName);
                statement.executeUpdate();
            } catch (
                    SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public String userData(String data, String login, String password) {
        final String sqlUser = "SELECT * FROM user_registration.user_data WHERE login=? and password=?";
        try (Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(sqlUser)) {
                 statement.setString(1,login);
                 statement.setString(2,password);
                 ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()){
                return resultSet.getString(data);
            }else {
                return "None";
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return "None";
    }

    private boolean validate(String login) {
        final String sqlSelect = "SELECT * FROM user_registration.user_data WHERE login=?";
        try (Connection connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(sqlSelect)) {
            statement.setString(1, login);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return false;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return true;
        }
        return true;
    }
}
