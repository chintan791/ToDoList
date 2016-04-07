
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import model.Status;
import model.ToDo1;
import model.Todolist;
import model.User;
import model.UserDetail1;

import org.junit.Test;
import org.junit.* ;
import static org.junit.Assert.* ;

public class UnitTest2 {



	
	 @Test
	   public void test_todotable() 
	 {
		ToDo1 tidu=new ToDo1();
		
		
	      System.out.println("Test for number of rows in todo table") ;
  // 
	      List<Todolist> list1=tidu.Find1(1);
   
       assertEquals(list1.size(),5); 
	 }
	  	
	
	 
	   
	   
	 	 
}