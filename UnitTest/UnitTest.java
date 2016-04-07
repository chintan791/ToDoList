

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import model.Status;
import model.Todolist;
import model.User;
import model.UserDetail1;

import org.junit.Test;
import org.junit.* ;
import static org.junit.Assert.* ;

public class UnitTest {



	
	 @Test
	   public void test_Add1() 
	 {
		
		 UserDetail1 info=new UserDetail1();
	      System.out.println("Test for a user input value") ;
  // 
        info.Find(1);
     
       assertEquals(info.Find(1).get(0).getUsername(),"Chintan"); 
	 }
	  	
	
	 
	   
	   
	 	 
}


