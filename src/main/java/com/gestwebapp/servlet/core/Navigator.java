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
import javax.servlet.http.HttpSession;

import com.gest.core.business.dao.DaoAula;
import com.gest.core.business.dao.DaoCorso;
import com.gest.core.business.vo.VoAula;
import com.gest.core.business.vo.VoCorso;
import com.mysql.cj.Session;

@WebServlet (urlPatterns = {"/home","/corsi","/logout","/aule"})
public class Navigator extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String path = req.getServletPath();
		String outPath = "";

		if (path.equals("/home")) {
			outPath = "/WEB-INF/pages/index.jsp";
		}else if (path.equals("/corsi")) {
			List<VoCorso> vc = new ArrayList<VoCorso>();
			try {
				vc = DaoCorso.read();
			} catch (SQLException e) {
				System.err.println("errore col database, query non eseguita");
			}
			req.setAttribute("listCorsi", vc);
			outPath = "/WEB-INF/pages/corsi.jsp";
		}else if (path.equals("/logout")) {
			HttpSession session = req.getSession();
			session.invalidate();
			outPath = "/WEB-INF/pages/index.jsp";
		}else if(path.equals("/aule")){
			List<VoAula> va = new ArrayList<VoAula>();
			try {
				va = DaoAula.read();
			} catch (SQLException e) {
				System.err.println("errore col database, query non eseguita");
			}
			req.setAttribute("listAula", va);
			outPath = "/WEB-INF/pages/aule.jsp";
		}
		getServletContext().getRequestDispatcher(outPath).forward(req, res);
	}


}
