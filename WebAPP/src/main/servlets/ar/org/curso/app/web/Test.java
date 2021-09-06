package ar.org.curso.app.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Test() {
        // TODO Auto-generated constructor stub
    }

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    	//response.setContentType("image/jpeg");
        try (PrintWriter out = response.getWriter()) { 
        out.println("<!DOCTYPE html>");
        out.println("<html lang=es>");
        out.println("<head>");
        out.println("<title>Servlet Test</title>");            
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Servlet Test at " + request.getContextPath() + "</h1>");
        out.println("<h2>Hola Mundo Servlet</h2>");
        String nombre=request.getParameter("nombre");//¿Pórque toma como parametro un string "nombre" y no se deja vacio?
        if(nombre!=null && !nombre.isEmpty()) {
        	out.println("Hola "+nombre);
        	System.out.println("Se ingreso un parametro!");
        }
       request.getParameterMap()
       .keySet()
       .forEach((k)-> System.out.println( request.getParameter(k)));
       
     
    
    
    out.println("</body>");
    out.println("</html>");
}
}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		processRequest(request, response);
	}

}
