package hello;

// changes

import static org.junit.Assert.*;



import org.junit.Before;

import org.junit.Test;





public class TestGreeter {



   private Greeter g;

	

   @Before

   public void setUp() throws Exception 

   {

      g = new Greeter();

   }



   @Test

   public void testGreeterEmpty() 

   {

      assertEquals(g.getName(),"");

      assertEquals(g.sayHello(),"Hello!");

   }

	

   @Test

   public void testGreeter() 

   {

      g.setName("World");

      assertEquals(g.getName(),"World");

      assertEquals(g.sayHello(),"Hello World!");

   }
   
   // Karen's added tests:
   
   // These two tests should pass
   @Test

   public void testGreeterKarenPass() 

   {
       g.setName("Karen");
       g.setName("");
       g.setName("Karen");
      assertEquals(g.getName(),"Karen");

      assertEquals(g.sayHello(),"Hello Karen!");

   }
   
   @Test

   public void newtestKcpGreeterPass() 

   {
       g.setName(Integer.toString(123));

      assertEquals(g.getName(),"123");

      assertEquals(g.sayHello(),"Hello 123!");

   }
   
   // This test should fail
   
   @Test

   public void newtestKcpGreeterFail() 

   {
       g.setName(123);

      assertEquals(g.getName(),"123");

      assertEquals(g.sayHello(),"Hello 123!");

   }
}