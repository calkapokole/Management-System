package model;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class Qualification {
	public int numberOfQualifications;
	public int practice;
	private int yearNow;
	private int monthNow;
	private Worker worker;
	private Date date;
	public Set<String> set = new HashSet<String>(10);
	public static final String dateFormat = "yyyy-MM-dd";
	
	public void setQualification() {
		set.addAll(Arrays.asList(new String[]{"java", "python", "c", "c++", "c#", "php", 
				"delphi", "scala", "perl", "ruby"}));
	}
	
	/*
	 * Metoda zwraca liczbę kwaligikacji danego pracownika
	 */
	public int getNumberOfQualification(String firstName, String lastName) {
		return numberOfQualifications;
	}
	
	/*
	 * Metoda zwraca kwalifikacje danego pracownika w postaci Stringu
	 */
	public String getWorkerQualification(String firsName, String lastName) {
		return "";
	}
	
	/*
	 * Metoda pozwala menagerowi na dodanie pracownikowi odpowiednich 
	 * kwalifikacji (certyfikat po przebytym szkoleniu)
	 */
	public void addQualification(String firstName, String lastName, int add) {
		numberOfQualifications += add;
	}
	
	/*
	 * Metoda zwraca liczbe miesiecy jakie przepracowal dany pracownik
	 * od czasu zatrudnienia
	 */
	public int getPractice(String firstName, String lastName) {
		date = worker.getDateEmployed(firstName, lastName);
		practice = (isYearNow() * 12 + isMonthNow()) - (date.getYear() * 12 + date.getMonth());
		return practice;
	}
	
	/*
	 * Metoda zwraca aktualny czas w postaci Stringu o formacie:
	 * yyyy-MM-dd
	 */
	public String isNow() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		return sdf.format(cal.getTime());
	}
	
	/*
	 * Metoda przetwarza String z metody isNow i zwraca yearNow
	 */
	public int isYearNow() {
		return yearNow;
	}
	
	/*
	 * Metoda przetwarza String z metody isNow i zwraca monthNow
	 */
	public int isMonthNow() {
		return monthNow;
	}
}
