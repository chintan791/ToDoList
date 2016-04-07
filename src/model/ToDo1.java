package model;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class ToDo1 {
	public List <Todolist> Find1(long input)
	{
        EntityManager em1 = DBUtil.getEmFactory().createEntityManager();
        
		return em1.createQuery("SELECT t from Todolist t INNER JOIN User u"
				+" ON u.userid = t.user.userid"
				+" where t.user.userid =:userid",Todolist.class)
        		
                .setParameter("userid", input).getResultList();
           
    }
}
