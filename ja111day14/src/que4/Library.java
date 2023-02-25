package que4;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	List<Book> bookList = new ArrayList<>();
	
	void addBook(Book book) {
		bookList.add(book);
		
	}
	
	 public boolean isEmpty() {
		 //This method should return true if the booklist is empty else
		// return false
//		 
//		 if(bookList.isEmpty()) {
//			 return true;
//		 }
//		 else {
//			 return false;
//		 }
		 
		 return bookList.isEmpty();
		 
		 
	 }
	 
	 public List<Book> viewAllBooks(){
		 return bookList;
		 
	 }
	 
	 public List<Book> viewBooksByAuthor(String author ){
		 
		 List<Book> viewBook = new ArrayList<>();
		 
		 for(Book book : bookList) {
			 if(book.getAuthor().equalsIgnoreCase(author)) {
				 viewBook.add(book);
			 }
			
		 }
		 if(viewBook.isEmpty()) {
			 System.out.println("list is empty..");
			 //return viewBook;
		 }
		 return viewBook;
		 
	 }
	 
	 public int countNoOfBook(String bookName) {
		 int count = 0;
		 for(Book book : bookList) {
			 if(book.getBookName().equalsIgnoreCase(bookName)) {
				 count++;
			 }
		 }
		 return count;
		 
	 }


}
