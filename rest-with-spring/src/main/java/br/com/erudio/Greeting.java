package br.com.erudio;

public class Greeting {

	private long id;
	private String content;
	

	
	public long getId() {
		return id;
	}
	public String getContent() {
		return content;
	}

	public Greeting(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}

}
