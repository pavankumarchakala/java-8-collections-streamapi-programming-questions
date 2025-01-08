package com.test;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Age_Of_Person_In_Years {

	public static void main(String[] args) {
		LocalDate dateOfBirth = LocalDate.of(1990, 6, 12);
		LocalDate now = LocalDate.now();

		System.out.println("Age in years: " + ChronoUnit.YEARS.between(dateOfBirth, now));

	}

}
