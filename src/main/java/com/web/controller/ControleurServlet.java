package com.web.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.metier.CreditMetier;
import com.web.model.CreditModel;

public class ControleurServlet extends HttpServlet {

	private CreditMetier metier;
	
	@Override
	public void init() throws ServletException {
		metier = new CreditMetier();
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//pour afficher les valeur par déffaut 
		request.setAttribute("mod", new CreditModel());
		request.getRequestDispatcher("VueCredit.jsp").forward(request,response);
	}
	
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		double montant = Double.parseDouble(request.getParameter("montant"));	
		double taux = Double.parseDouble(request.getParameter("taux"));	
		int duree = Integer.parseInt(request.getParameter("duree"));	
		
		CreditModel model = new CreditModel();
		model.setMontant(montant);
		model.setDuree(duree);
		model.setTaux(taux);
		
		
		
		double res = metier.claculMensualite(montant, duree, taux);
		model.setMensualite(res);
		request.setAttribute("mod", model);
		request.getRequestDispatcher("VueCredit.jsp").forward(request,response);

		
		
		
		
		
		
		
				}
}
