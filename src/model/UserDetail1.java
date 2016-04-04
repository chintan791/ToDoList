package model;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

public class UserDetail1 {
	public TypedQuery <User> Find(long userid)
	{
        EntityManager em1 = DBUtil.getEmFactory().createEntityManager();
        return em1.createQuery("SELECT u FROM User u WHERE u.userid =:userid",User.class)
                .setParameter("userid", userid);
           
    }

}
