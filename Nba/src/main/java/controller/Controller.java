package controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.mvpModel;
import model.starModel;
import model.timeModel;

@WebServlet(urlPatterns = { "/Controller", "/main", "/insert" })
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	timeModel time = new timeModel();
	mvpModel Mvp = new mvpModel();
	starModel Star = new starModel();

	public Controller() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset-UTF-8");
		request.getRequestDispatcher("novo.html");
		if ((request.getParameter("nome") != null && !request.getParameter("nome").isEmpty())
				&& (request.getParameter("titulos") != null && !request.getParameter("titulos").isEmpty())
				&& (request.getParameter("mvp") != null && !request.getParameter("mvp").isEmpty())
				&& (request.getParameter("mvpClass") != null && !request.getParameter("mvpClass").isEmpty())
				&& (request.getParameter("mvpNac") != null && !request.getParameter("mvpNac").isEmpty())
				&& (request.getParameter("star") != null && !request.getParameter("star").isEmpty())
				&& (request.getParameter("starClass") != null && !request.getParameter("starClass").isEmpty())
				&& (request.getParameter("starNac") != null && !request.getParameter("starNac").isEmpty())) {

			String nome = request.getParameter("nome");
			String titulos = request.getParameter("titulos");

			String mvp = request.getParameter("mvp");
			String mvpClass = request.getParameter("mvpClass");
			String mvpNac = request.getParameter("mvpNac");

			String star = request.getParameter("star");
			String starClass = request.getParameter("starClass");
			String starNac = request.getParameter("starNac");

			timeModel time = new timeModel(nome, titulos);
			time.salvar();

			mvpModel teste = new mvpModel(mvp, mvpClass, mvpNac);
			teste.salvar();

			starModel teste1 = new starModel(star, starClass, starNac);
			teste1.salvar();
			response.sendRedirect("main");

		}
	}
}
