package view;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.MainController;

import java.text.ParseException;

public class HomeView extends HttpServlet{
	//Obligatoire pour la définition d'un servlet
	private static final long serialVersionUID = 1L;
	private static MainController mainController=null;
	public static int memberPageSize=7;
	
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		
		//pseudo-singleton pour garantir l'unicité du controlleur
		if (mainController==null) {
			try {
				mainController=new MainController();
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		
		int memberPage=1;
		int memberTotalPages=1+mainController.getMembers().size()/memberPageSize;
		
		//gestion des parametres recus dans la requete
		if(request.getParameter("memberPage") != null)
            memberPage = Integer.parseInt(request.getParameter("memberPage"));
		
		//transmission des parametres a la jsp
		request.setAttribute("controller", mainController);
		request.setAttribute("currentMembers", mainController.getMemberSubest((memberPage-1)*memberPageSize, memberPageSize));
		request.setAttribute("memberTotalPages", memberTotalPages);
		request.setAttribute("memberPage", memberPage);
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/home.jsp" ).forward( request, response );
    }
}
