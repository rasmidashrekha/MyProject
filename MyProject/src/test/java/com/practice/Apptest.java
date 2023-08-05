package com.practice;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Apptest {
   @Test
   
   public void testlogin1() 
   {
	  Testpractice mytest=new Testpractice();
	  Assert.assertEquals(0, mytest.userLogin("abc", "abc123"));
	  
	  
	
}
   @Test
  
   public void testlogin2() {
	   Testpractice mytest=new Testpractice();
		  Assert.assertEquals(1, mytest.userLogin("abc", "abc@123"));
		  
   }
   
}
