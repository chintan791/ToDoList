

import java.io.IOException;
import java.util.List;

import javax.net.ssl.SSLEngineResult.Status;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.StatusDetail1;
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
         
      //   request.getRequestDispatcher("/out1.jsp").forward(request, response);
   
		
//List<Status> list1=info.Find1(session.getAttribute(output)).getResultList();
         
  //      String input2 = (String) request.getSession().getAttribute("output");
        
        System.out.println("So input given was "+input);
        
        ToDo1 info1=new ToDo1();
        
        String output2="",username="",Task="",Desc="",Priority="", StatDesc="";
         
         List<Todolist> list1=info1.Find1(input).getResultList();
         
         System.out.println("Lets see what this is "+list1);
       
    
         
        for (Todolist u3:list1)
         {
            System.out.println("check1");
       
           username +=u3.getUser().getUsername();
           Task +=u3.getTask();
           Desc +=u3.getDescription();
           Priority += u3.getPriority();
           StatDesc += u3.getStatus().getDescription();
 
         }
        
        System.out.println("And the output2 is "+username);
        
        session.setAttribute("list1", list1);
        
        System.out.println("Hello its me");
		
		request.getRequestDispatcher("/output.jsp").forward(request, response);

	}

}
