package Unit22;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
    DaoService daoService = new DaoService();
    private final String LOGIN_PARAM = "log_register";
    private final String PASSWORD_PARAM = "pas_register";
    private final String FIRST_NAME_PARAM = "firstName_register";
    private final String LAST_NAME_PARAM = "lastName_register";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.setCharacterEncoding("UTF-8");
        String login = req.getParameter(LOGIN_PARAM);
        String password = req.getParameter(PASSWORD_PARAM);
        String firstName = req.getParameter(FIRST_NAME_PARAM);
        String lastName = req.getParameter(LAST_NAME_PARAM);
        daoService.addUser(login,password,firstName,lastName);
        resp.sendRedirect("index.html");
    }
}
