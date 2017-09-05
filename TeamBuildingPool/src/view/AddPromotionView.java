package view;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controller.MainController;
import model.CRClass;

public class AddPromotionView extends HttpServlet{
	//Obligatoire pour la définition d'un servlet
	private static final long serialVersionUID = 1L;
	
	public static final String View="/WEB-INF/add_promotion.jsp";
	
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		this.getServletContext().getRequestDispatcher(View).forward( request, response );
	}
	
    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
    	MainController mainController=MainController.getInstance();
    	String name=request.getParameter("className");
    	try {
    		validateClassName(name);
    		mainController.getClasses().add(new CRClass(name));
    	} catch (Exception e) {
    		
    	} 
    	
    	request.setAttribute("result", name);
    	this.getServletContext().getRequestDispatcher(View).forward(request, response );
    }
    
    private void validateClassName(String name) throws Exception {
//    	MainController mainController=MainController.getInstance();
    	if (name.isEmpty())
    		throw new Exception();
//    	else if (mainController.getClasses().contains(o))
    }
}
