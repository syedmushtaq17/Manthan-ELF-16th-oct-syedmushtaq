package com.manthan.datetime;
 import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class TestC {

	public static void main(String[] args) {
		
		LocalDate ld= LocalDate.now();
		System.out.println(ld);
		
		DateTimeFormatter dt=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println(dt.format(ld));
//format changer for month capital MM 
		LocalDateTime ldt  =	LocalDateTime.now();
		DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd-MM-yyyy h:m:s a");
		// a is for am/pm
		System.out.println(dtf.format(ldt));
		
		LocalTime lt= LocalTime.now();
		System.out.println(lt);
	}
	
}
