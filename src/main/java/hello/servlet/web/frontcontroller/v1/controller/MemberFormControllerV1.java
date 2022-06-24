package hello.servlet.web.frontcontroller.v1.controller;

import hello.servlet.web.frontcontroller.v1.ControllerV1;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MemberFormControllerV1 implements ControllerV1 {

    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String viewPath = "/WEB-INF/views/new-form.jsp";

        // controller -> View로 이동하는 부분
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);

        //Servlet -> JSP호출, dispatcher가 Servlet(Controller)에서 viewPath(JSP)를 찾아가서, 해당 파일로 제어권이 넘어감.
        dispatcher.forward(request, response);
    }
}
