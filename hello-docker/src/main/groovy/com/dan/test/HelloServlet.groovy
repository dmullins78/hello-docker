package com.dan.test;

import java.io.IOException;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet(urlPatterns=["/hello"], name="HelloTest")
public class HelloServlet extends HttpServlet {

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String mode = System.getenv("HELLO_MODE")

    String sv = request.getParameter("secretValue")
    if(sv != null) {
      System.out.println("Setting SV to ${sv}")
        request.getSession().setAttribute("sv", sv) 
    }

    PrintWriter out = response.getWriter()
    out.println("Hello from  " + mode)

    Enumeration keys = session.getAttributeNames();
    while (keys.hasMoreElements()) {
      String key = (String)keys.nextElement();
      out.println(key + ": " + session.getValue(key) + "<br>");
    }

    out.close()
  }
}
