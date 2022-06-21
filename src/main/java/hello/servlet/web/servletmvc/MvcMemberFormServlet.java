package hello.servlet.web.servletmvc;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "mvcMemberFormServlet", urlPatterns = "/servlet-mvc/members/new-form")
public class MvcMemberFormServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String viewPath = "/WEB-INF/views/new-form.jsp";

        // controller -> View로 이동하는 부분
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);

        //Servlet -> JSP호출, dispatcher가 Servlet(Controller)에서 viewPath(JSP)를 찾아가서, 해당 파일로 제어권이 넘어감.
        dispatcher.forward(request, response);
    }

}
