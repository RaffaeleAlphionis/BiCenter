package com.gestwebapp.servlet.core;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gest.core.business.dao.DaoDipendente;
import com.gest.core.business.vo.VoDipendente;

@WebServlet (urlPatterns = {"/login","/checkLogin"})
public class ServletLogin extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String path = req.getServletPath();
		String outPath = "";

		if (path.equals("/login")) {
			outPath = "/WEB-INF/pages/login.jsp?err=";
		}
		getServletContext().getRequestDispatcher(outPath).forward(req, resp);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String username = req.getParameter("user");
		String password = req.getParameter("pass");
		VoDipendente logeduser = new VoDipendente();
		logeduser.setUsername(username);
		logeduser.setPassword(password);
		HttpSession session = req.getSession();
		String outPath="";
		try {
			if(DaoDipendente.login(logeduser)) {

				session.setAttribute("userInSession", logeduser.getUsername());
				outPath="/WEB-INF/pages/welcome.jsp";
			}else{
				outPath="/WEB-INF/pages/login.jsp?err=errore";
			}
		} catch (SQLException e) {
			System.err.println("Errore nel Login");
			outPath="/WEB-INF/pages/login.jsp?err=sistema";
		}
		getServletContext().getRequestDispatcher(outPath).forward(req, resp);
	}
	
	
}
