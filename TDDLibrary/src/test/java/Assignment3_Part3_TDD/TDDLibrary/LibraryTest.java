package Assignment3_Part3_TDD.TDDLibrary;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LibraryTest {
	
	private Library obj;
	private Books bookobj;
	int bookInventory;
	List<Books> bookList;
	List<Books> bookNameandQuantity;

	@Before
	public void setUp() throws Exception {
		
		int bookInventory=0;
		
		bookList= new  ArrayList<Books>();
		bookNameandQuantity= new ArrayList<Books>();
		obj= new Library();
		bookobj= new Books();
		
		bookobj.setTitle("abc");
		bookobj.setAuthor("ee");
		bookobj.setPrice(12);
		bookobj.setRent(1);
		bookobj.setBookQuantity(1);
		bookInventory=obj.addBooks(bookobj, bookobj);
		//obj.addBooks(bookobj, bookobj);
		
		
	}

	@After
	public void tearDown() throws Exception {
		obj=null;
		bookList=null;
		bookobj=null;
		bookInventory=0;
	}

	
	@Test
	public void testAddBooks() {
		
		bookobj.setTitle("abc");
		bookobj.setAuthor("ee");
		bookobj.setPrice(12);
		bookobj.setRent(1);
		bookobj.setBookQuantity(1);
		bookInventory=obj.addBooks(bookobj, bookobj);	
		//obj.addBooks(bookobj, bookobj);
		
		int expected=2;
					
				
		assertEquals(expected,bookInventory);
		
		
	}


	
	@Test
	public void testRentCalculation() {
		
		double ExpetcedPrice=2;	
		double Actual=obj.rentCalculation("abc", 2);
		
	assertEquals(ExpetcedPrice,Actual,0.0 );
			
	}

	@Test
	public void testBookReturn() {
		
	}

}
