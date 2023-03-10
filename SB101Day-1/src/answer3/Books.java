package answer3;

import java.util.Objects;

public class Books {
	
	private int bookId; //(Unique_id);
	private String bookName;
	private String BookAuthor;
	
	
	public Books() {
		// TODO Auto-generated constructor stub
	}


	public Books(int bookId, String bookName, String bookAuthor) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		BookAuthor = bookAuthor;
	}


	@Override
	public int hashCode() {
		return Objects.hash(BookAuthor, bookId, bookName);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Books other = (Books) obj;
		return Objects.equals(BookAuthor, other.BookAuthor) && bookId == other.bookId
				&& Objects.equals(bookName, other.bookName);
	}


	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getBookAuthor() {
		return BookAuthor;
	}


	public void setBookAuthor(String bookAuthor) {
		BookAuthor = bookAuthor;
	}


	@Override
	public String toString() {
		return "Books [bookId=" + bookId + ", bookName=" + bookName + ", BookAuthor=" + BookAuthor + "]";
	}
	
	

}
