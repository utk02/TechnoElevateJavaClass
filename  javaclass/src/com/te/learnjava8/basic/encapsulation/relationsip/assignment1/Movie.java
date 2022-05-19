package com.te.learnjava8.basic.encapsulation.relationsip.assignment1;

import java.time.LocalDate;

public class Movie {
	private String movieName;
	private double movieBudget;
	private LocalDate movieReleaseDate;

	Director director1 = new Director("Rajamouli", 100000000, 30); // Early instantiation

	Actor actor; // Late instantiation

	public Movie(String movieName, double movieBudget, LocalDate movieReleaseDate) {
		super();
		this.movieName = movieName;
		this.movieBudget = movieBudget;
		this.movieReleaseDate = movieReleaseDate;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public double getMovieBudget() {
		return movieBudget;
	}

	public void setMovieBudget(double movieBudget) {
		this.movieBudget = movieBudget;
	}

	public LocalDate getMovieReleaseDate() {
		return movieReleaseDate;
	}

	public void setMovieReleaseDate(LocalDate movieReleaseDate) {
		this.movieReleaseDate = movieReleaseDate;
	}

	public Director getDirector1() {
		return director1;
	}

	public void setDirector1(Director director1) {
		this.director1 = director1;
	}
/**
 * Late instantiation
 */
	public void createActor() { // Helper method
		actor = new Actor("Prabhas", 150000000, 15);
	}

	@Override
	public String toString() {
		return "Movie [movieName=" + movieName + ", movieBudget=" + movieBudget + ", movieReleaseDate="
				+ movieReleaseDate + ", director1=" + director1 + ", actor=" + actor + "]";
	}

}
