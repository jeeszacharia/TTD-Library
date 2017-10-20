package Assignment3_Part3_TDD.TDDLibrary;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class Library {
	
private List<Books> bookList;
final private List<Books> bookNameandQuantity;
int ArrayLisyindexCounter=0;
int originalQuantity = 0;

public Library(){
	
	bookList = new ArrayList<Books>();
	//This ArrayList is created to store the initial values of book Inventory.
	bookNameandQuantity= new ArrayList<Books>();
}

public int addBooks(Books book,Books book1){
	
	bookList.add(book);
	
	int ListVal=bookList.size();
	
	System.out.println(ListVal);
	
	return ListVal;
	
}

// This method is created to get the initial Quantity to validate item return which should'nt exceed actual stock.
public int getInitialQuantity(String Title){
	
for(int j=0;j<bookNameandQuantity.size();j++){
		
		if(Title.equals(bookNameandQuantity.get(j).getTitle())){
			
			originalQuantity=bookNameandQuantity.get(j).getBookQuantity();
									
		}
	}
return originalQuantity;
}


public double rentCalculation(String Title,int Days){
	
	double Tot=0.0;
	int bookQuantity;
		
	for (int i=0; i<bookList.size(); i++){
		
		if(bookList.get(i).getBookQuantity() !=0){
		
		if(Title.equals(bookList.get(i).getTitle())){
		Tot= (Days*bookList.get(i).getRent());
				
		bookQuantity=bookList.get(i).getBookQuantity();
		bookList.get(i).setBookQuantity(bookQuantity-1);
									
		}
	}else{return 0;}
	}
		
	return Tot;
	
}

public int bookReturn(String Title){
	
	int bookQuantity;
	int returnStatus = 0;
	
		
	for (int i=0; i<bookList.size(); i++){
		
								
		if(Title.equals(bookList.get(i).getTitle())& bookList.get(i).getBookQuantity()<originalQuantity){
			
	
				bookQuantity=bookList.get(i).getBookQuantity();
				bookList.get(i).setBookQuantity(bookQuantity+1);
				//bookList.get(i).getBookQuantity();
				
				returnStatus=1;
				break;
			
			}else{
				
				returnStatus=0;
				
			}
				
			
		}
	return returnStatus;
		
}


@Override
public String toString(){
	String TotalBooks="\n";
	
	Iterator<Books> i = bookList.iterator();
	while(i.hasNext()){
		Books b = (Books) i.next();
		TotalBooks = TotalBooks + b.toString();
	}
	return TotalBooks;
	
}
	

}
