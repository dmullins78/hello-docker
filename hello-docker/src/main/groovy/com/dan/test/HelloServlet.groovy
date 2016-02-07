package com.dan.test;

import java.io.IOException;
import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet(urlPatterns=["/hello"], name="HelloTest")
public class HelloServlet extends HttpServlet {

  String secretValue;

  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    String mode = System.getenv("HELLO_MODE")

    String sv = request.getParameter("secretValue")
    if(sv) {
      secretValue = sv
    }

    PrintWriter out = response.getWriter()
    out.println("Hello from  " + mode)
    out.println("SV is  " + secretValue)
    out.close()
  }
}
