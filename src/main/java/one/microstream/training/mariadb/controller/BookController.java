package one.microstream.training.mariadb.controller;

import java.util.List;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import one.microstream.training.mariadb.domain.Book;
import one.microstream.training.mariadb.storage.DB;
import one.microstream.training.mariadb.utils.MockupUtils;


@Controller("/books")
public class BookController
{
	@Get("/create")
	public HttpResponse<?> createBooks()
	{
		
		List<Book> allCreatedBooks = MockupUtils.loadMockupData();

        DB.root.getBooks().addAll(allCreatedBooks);
        DB.storageManager.store(DB.root.getBooks());

        return HttpResponse.ok("Books successfully created!");
	}
	
	@Get
	public List<Book> getBook()
	{
		return DB.root.getBooks();
	}
	
}
