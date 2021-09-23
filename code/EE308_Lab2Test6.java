package EE308_Lab2;
import EE308_Lab2.EE308_Lab2;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 
	public class EE308_Lab2Test6 { 
		@Before
		public void before() throws Exception { 
		} 
		@After
		public void after() throws Exception { 
		} 
		@Test
		public void testInitKeyword() throws Exception { 
			//TODO: Test goes here... 
		} 
		@Test
		public void testIsChar() throws Exception { 
			//TODO: Test goes here...
			Assert.assertEquals(true,EE308_Lab2.IsChar('f'));
			Assert.assertEquals(false,EE308_Lab2.IsChar('='));
		} 	
		@Test
		public void testStack() throws Exception { 
			//TODO: Test goes here... 
		} 
		@Test
		public void testDeleteSingleLineComment() throws Exception { 
			//TODO: Test goes here...
			Assert.assertEquals("123rj210f321", EE308_Lab2.DeleteSingleLineComment("123rj210f321//w221d21d21r"));
		} 
		@Test
		public void testDeleteMultiLineComment() throws Exception { 
			//TODO: Test goes here...
			Assert.assertEquals("22f2f2f2f12f",EE308_Lab2.DeleteMultiLineComment
					("22f2f2f2f/*21f212f*/12f"));
			Assert.assertEquals("22f2f2f2f",EE308_Lab2.DeleteMultiLineComment
					("22f2f2f2f/*21f212f12f"));
		} 
		@Test
		public void testDeleteInsideString() throws Exception {
			//TODO: Test goes here...
			Assert.assertEquals("22f2f2f2f12f2323",EE308_Lab2.DeleteInsideString
					("22f2f2f2f12f\"222222\"2323"));
		} 

		@Test
		public void testTraverse() throws Exception { 
			//TODO: Test goes here... 
		} 
		@Test
		public void testMain() throws Exception { 
			//TODO: Test goes here... 
		} 
} 
