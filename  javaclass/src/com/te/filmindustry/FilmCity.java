package com.te.filmindustry;

public class FilmCity {

	public static void main(String[] args) {

		Actor a1 = new Actor();
		a1.setName("Prabhas");
		a1.setPrice(500000000);

		a1.setM1(a1.shootMovie());
		
		System.out.println(a1);

	}

}
