package com.gestwebapp.servlet.core;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet (urlPatterns = {"/home"})
public class Navigator extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String path = req.getServletPath();
		String outPath = "";

		if (path.equals("/home")) {
			outPath = "/WEB-INF/pages/index.jsp";
		}
		getServletContext().getRequestDispatcher(outPath).forward(req, res);
	}


}
