<%@ page import="hello.servlet.domain.member.Member" %>
<%@ page import="java.io.PrintWriter" %>
<%@ page import="hello.servlet.domain.member.MemberRepository" %><%--
jsp파일은 webapp 파일 밑에 만들어야 한다
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    // java 코드를 쓸 수 있는 부분

    // JSP는 서버내부에서 서블릿으로 자동 변환됨 -> request, response는 서블릿 쓰는 것 처럼 그대로 사용하면 됨 (마찬가지로 모든 자바코드를 그대로 다 사용할 수 잇음)
    MemberRepository memberRepository = MemberRepository.getInstance();

    System.out.println("MemberSaveServlet.service");
    String username = request.getParameter("username");
    Integer age = Integer.parseInt(request.getParameter("age"));

    Member member = new Member(username,age);
    memberRepository.save(member);

    /**
    response.setContentType("text/html");
    response.setCharacterEncoding("utf-8");
    PrintWriter w = response.getWriter();

    w.write("<html>\n" +
            "<head>\n" +
            "    <meta charset=\"UTF-8\">\n" +
            "</head>\n" +
            "<body>\n" +
            "성공\n" +
            "<ul>\n" +
            "    <li>id="+member.getId()+"</li>\n" +
            "    <li>username="+member.getUserName()+"</li>\n" +
            "    <li>age="+member.getAge()+"</li>\n" +
            "</ul>\n" +
            "<a href=\"/index.html\">메인</a>\n" +
            "</body>\n" +
            "</html>"); **/
    // java 코드를 쓸 수 있는 부분
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
성공
<ul>
    <li>id=<%=member.getId()%></li>
    <li>id=<%=member.getUserName()%></li>
    <li>id=<%=member.getAge()%></li>
</ul>
<a href="/index.html">메인</a>
</body>
</html>
