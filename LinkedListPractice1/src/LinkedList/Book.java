package LinkedList;

public class Book {

	
	private String name;
	private String Author;
	private String genre;
	
	private Book next;

	public Book(String name, String author, String genre) {
		super();
		this.name = name;
		this.Author = author;
		this.genre = genre;
		this.next = null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Book getNext() {
		return next;
	}

	public void setNext(Book next) {
		this.next = next;
	}

	
	public String getData() 
	{
		return "Book [name=" + name + ", Author=" + Author + ", genre=" + genre + "]";
	}
	
	
	
	
}
