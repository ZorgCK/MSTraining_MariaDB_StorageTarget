package one.microstream.training.mariadb.storage;

import java.util.ArrayList;
import java.util.List;

import one.microstream.training.mariadb.domain.Book;


public class DataRoot
{
	private List<Book> books = new ArrayList<Book>();
	
	public List<Book> getBooks()
	{
		return books;
	}

	public void setBookList(List<Book> loadMockupData)
	{
		this.books = books;
	}
}
