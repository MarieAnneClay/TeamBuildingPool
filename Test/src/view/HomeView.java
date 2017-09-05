package view;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.text.ParseException;

import Controller.MainController;

public class HomeView extends HttpServlet{
	//Obligatoire pour la définition d'un servlet
	private static final long serialVersionUID = 1L;
	private static MainController mainController=null;
	
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
//		String paramAuteur = request.getParameter( "auteur" );
//		String message = "Transmission de variables : OK ! "+paramAuteur;
//	    
//		Member m = new Member();
//		m.setName("Bob");
//		
//		List<Integer> premiereListe = new ArrayList<Integer>();
//		premiereListe.add( 27 );
//		premiereListe.add( 12 );
//		premiereListe.add( 138 );
//		premiereListe.add( 6 );
//		
//		request.setAttribute( "test", message );
//		request.setAttribute("member", m);
//		request.setAttribute( "liste", premiereListe );
		
		if (mainController==null) {
			try {
				mainController=new MainController();
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}
		
		request.setAttribute("controller", mainController);
		
		this.getServletContext().getRequestDispatcher( "/WEB-INF/home.jsp" ).forward( request, response );
    }
	
	
}
