package com.te.learnjava8.basic.encapsulation.relationsip.assignment1;

import java.time.LocalDate;

public class MovieTest {
	public static void main(String[] args) {
		Movie movie = new Movie("Bahubali", 300000000, LocalDate.of(2015, 03, 15));

		movie.createActor();
		
		System.out.println(movie);
	}

}
