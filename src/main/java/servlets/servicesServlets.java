package servlets;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

//import javax.servlet.*;
//import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class    servicesServlets extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("views/services.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
