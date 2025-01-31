package crolling;

public class Movie {
	private String title;
	private String start;
	private String star;
	private String learning_time;
	private String content;
	
	public Movie(String title, String start, String star, String learning_time, String content) {
		this.title = title;
		this.start = start;
		this.star = star;
		this.learning_time = learning_time;
		this.content = content;
	}
	
	
	public String getTitle() {
		return title;
	}
	public String getStart() {
		return start;
	}
	public String getStar() {
		return star;
	}
	public String getLearning_time() {
		return learning_time;
	}
	public String getContent() {
		return content;
	}


	@Override
	public String toString() {
		return "Movie [title=" + title + ", start=" + start + ", star=" + star + ", learning_time=" + learning_time
				+ ", content=" + content + "]";
	}
	
}

