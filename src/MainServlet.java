

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.ToDo1;
import model.Todolist;
import model.User;
import model.UserDetail1;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		UserDetail1 info=new UserDetail1();
		
		 String output="";
 	    
         String user_input=request.getParameter("id");
         System.out.println("User Input is: "+user_input);
         long input = Long.parseLong((user_input));
         System.out.println("User Input in long is: "+input);
         
         List<User> list=info.Find(input).getResultList();
         
         System.out.println("Lets see what this is "+list);
       
    
         
         for (User u1:list)
         {
             System.out.println("check1");
       
             output +=u1.getUsername();
         }
         
         System.out.println("check2");
         
         
         session.setAttribute("output", output);
         
         System.out.println(output);
         
         request.getRequestDispatcher("/out1.jsp").forward(request, response);
   
		
		
	}

}
