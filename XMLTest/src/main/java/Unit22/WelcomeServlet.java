package Unit22;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
    DaoService daoService = new DaoService();
    private final String LOGIN = "login";
    private final String PASSWORD = "password";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter(LOGIN);
        String password = req.getParameter(PASSWORD);
        String firstName = daoService.userData("first_name", login, password);
        String lastName = daoService.userData("last_name", login, password);
        req.setAttribute("firstName", firstName);
        req.setAttribute("lastName", lastName);
        String path ="/welcome.jsp";
        ServletContext servletContext = getServletContext();
        RequestDispatcher dispatcher = servletContext.getRequestDispatcher(path);
        dispatcher.forward(req,resp);
    }
}
