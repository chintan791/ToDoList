

import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.InsertDB;

/**
 * Servlet implementation class InsertServlet
 */
@WebServlet("/InsertServlet")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InsertServlet() {
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

		InsertDB iDB=new InsertDB();



		String username=request.getParameter("username");

		String todoid1=request.getParameter("todoid");

		int todoid= Integer.parseInt(todoid1);

		String task=request.getParameter("task");
		System.out.println(task);

		String description=request.getParameter("description");

		String priority=request.getParameter("priority");

		String duedate=request.getParameter("duedate");

		String datecompleted=request.getParameter("datecompleted");


		SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-DD");
		Date date =null;
		Date completed=null;
		try 
		{
			date= formatter.parse(duedate);
			completed=formatter.parse(datecompleted);
		} 
		catch (ParseException e) 
		{
			e.printStackTrace();
		}

		InsertDB.iDB(username,todoid,task,description,priority,date,completed);




		

	}

}
