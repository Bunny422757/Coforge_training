package com.coforge.day3;

public class Movie {

	String moviename;
	String director;
	double rating;

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [moviename=" + moviename + ", director=" + director + ", rating=" + rating + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie m = new Movie();
		m.setMoviename("Bahubali");
		m.setDirector("Rajamouli");
		m.setRating(9.8);

		System.out.println(m);
	}

}
