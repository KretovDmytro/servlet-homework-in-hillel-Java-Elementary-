package homeTask2426;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HomeServlet extends HttpServlet {

    private static int countDoGet = 0;
    private static int countDoPost = 0;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        ++countDoGet;

        request.setAttribute("countDoGet", countDoGet);
        request.setAttribute("countDoPost", countDoPost);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/jsp/page.jsp");
        try {
            requestDispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) {

        ++countDoPost;

        try {
            doGet(request, response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}