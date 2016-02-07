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
    PrintWriter out = response.getWriter()
    out.println("Hello from  " + mode + "<br>")

    request.getSession().setAttribute("LAST ACCESSED", "" + System.currentTimeMillis() + "<br>") 

    String sv = request.getParameter("secretValue")
    if(sv != null) {
      request.getSession().setAttribute("sv", sv) 
    }

    Enumeration keys = request.getSession().getAttributeNames()
    while (keys.hasMoreElements()) {
      String key = (String)keys.nextElement()
      out.println(key + ": " + request.getSession().getValue(key) + "<br>")
    }

    out.close()
  }
}
