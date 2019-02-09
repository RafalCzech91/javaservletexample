package com.rczech.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(
        name = "FirstServlet",
        urlPatterns = "/first"
)

public class FirstServlet extends HttpServlet {

}
