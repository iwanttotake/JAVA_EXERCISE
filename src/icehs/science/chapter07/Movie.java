package icehs.science.chapter07;

public class Movie {
	String title;
	String director;
	String genre;
	
	Movie() {
		
	}
	
	Movie(String title, String director){
		this.title = title;
		this.director = director;
	}
	
	Movie(String title, String director, String genre){
		this(title, director);
		this.genre = genre;
	}
}
