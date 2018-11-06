package com.gestwebapp.servlet.core;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gest.core.business.dao.DaoCorso;
import com.gest.core.business.vo.VoCorso;

@WebServlet (urlPatterns = {"/home","/corsi"})
public class Navigator extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String path = req.getServletPath();
		String outPath = "";

		if (path.equals("/home")) {
			outPath = "/WEB-INF/pages/index.jsp";
		}
		if (path.equals("/corsi")) {
			List<VoCorso> vc = new ArrayList<VoCorso>();
			try {
				vc = DaoCorso.read();
			} catch (SQLException e) {
				System.err.println("errore col database, query non eseguita");
			}
			req.setAttribute("listCorsi", vc);
			outPath = "/WEB-INF/pages/corsi.jsp";
		}
		getServletContext().getRequestDispatcher(outPath).forward(req, res);
	}


}
