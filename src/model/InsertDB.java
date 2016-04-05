package model;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;


public class InsertDB {
	
	
	
	public static void iDB(String username, int todoid,String task, String description, String priority, Date date, Date completed) {
		
	
		Todolist add=new Todolist();
		
		User user=new User();
		user.setUserid(todoid);
		
		Status status=new Status();
		status.getStatusid();
		add.setUser(user);
		add.setDescription(description);
		add.setTask(task);
		add.setPriority(priority);
		add.setDuedate(date);
		add.setDatecompleted(completed);
		
		System.out.println("Done");
	    
		EntityManager em = DBUtil.getEmFactory().createEntityManager();
		EntityTransaction trans = em.getTransaction();
		
		trans.begin();
		try {
		em.persist(add);
		trans.commit();
		} 
		catch (Exception e) 
		{
		System.out.println(e);
		trans.rollback();
		} 
		finally 
		{
		em.close();
		}
		
		
	
	
	
	
	}


}

	
