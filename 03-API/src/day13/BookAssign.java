package day13;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookAssign {

	public static void main(String[] args) {
		static List<String> categoryList = new ArrayList<>();
		static List<Author> authorList = new ArrayList<Author>();
		static List<Book> bookList = new ArrayList<Book>();
		
		
	}
}
class Author {
	private String name;
	private String country;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Author(String name, String country) {
		super();
		this.name = name;
		this.country = country;
	}
}

class Book {
	private int code;
	private String title;
	private LocalDate publishDate;
	private String category;
	private Author author;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public LocalDate getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public Book(int code, String title, LocalDate publishDate, String category, Author author) {
		super();
		this.code = code;
		this.title = title;
		this.publishDate = publishDate;
		this.category = category;
		this.author = author;
	}
}

class Category {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category(String name) {
		super();
		this.name = name;
	}
	
	
}
